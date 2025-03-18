package testcases.redis;

import com.example.common.redis.service.RedisService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.HashOperations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RedisServiceImplTest {

    @Mock
    private RedisTemplate<String, Object> redisTemplate;

    @Mock
    private ValueOperations<String, Object> valueOperations;

    @Mock
    private HashOperations<String, String, Object> hashOperations;

    @InjectMocks
    private RedisServiceImpl redisService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        when(redisTemplate.opsForHash()).thenReturn(hashOperations);
    }

    @Test
    void testSave() {
        redisService.save("testKey", "testValue");
        verify(valueOperations).set("testKey", "testValue");
    }

    @Test
    void testGet() {
        when(valueOperations.get("testKey")).thenReturn("testValue");
        Object result = redisService.get("testKey");
        assertEquals("testValue", result);
        verify(valueOperations).get("testKey");
    }

    @Test
    void testSaveHash() {
        redisService.saveHash("hashKey", "field", "value");
        verify(hashOperations).put("hashKey", "field", "value");
    }

    @Test
    void testGetHash() {
        when(hashOperations.get("hashKey", "field")).thenReturn("value");
        Object result = redisService.getHash("hashKey", "field");
        assertEquals("value", result);
        verify(hashOperations).get("hashKey", "field");
    }

    @Test
    void testSaveHashWithExpiry() {
        redisService.saveHashWithExpiry("hashKey", "field", "value", 60);
        verify(hashOperations).put("hashKey", "field", "value");
        verify(redisTemplate).expire("hashKey", 60, java.util.concurrent.TimeUnit.SECONDS);
    }
}
