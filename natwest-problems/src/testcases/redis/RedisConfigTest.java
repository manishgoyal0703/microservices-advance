package testcases.redis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class RedisConfigTest {

    @InjectMocks
    private RedisConfig redisConfig;

    @Mock
    private RedisConnectionFactory redisConnectionFactory;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRedisConnectionFactory() {
        RedisConnectionFactory factory = redisConfig.redisConnectionFactory();
        assertNotNull(factory);
    }

    @Test
    void testRedisTemplate() {
        RedisTemplate<String, Object> redisTemplate = redisConfig.redisTemplate(redisConnectionFactory);
        assertNotNull(redisTemplate);
        assertNotNull(redisTemplate.getConnectionFactory());
    }
}
