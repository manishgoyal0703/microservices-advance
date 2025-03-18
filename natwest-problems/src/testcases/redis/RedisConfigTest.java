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

    @Test
    void testRedisTemplate() {
        // Act
        RedisTemplate<String, Object> redisTemplate = redisConfig.redisTemplate(redisConnectionFactory);

        // Assert
        assertNotNull(redisTemplate);
        assertEquals(redisConnectionFactory, redisTemplate.getConnectionFactory());

        // Verify serializers
        assertInstanceOf(StringRedisSerializer.class, redisTemplate.getKeySerializer());
        assertInstanceOf(GenericJackson2JsonRedisSerializer.class, redisTemplate.getValueSerializer());
        assertInstanceOf(StringRedisSerializer.class, redisTemplate.getHashKeySerializer());
        assertInstanceOf(GenericJackson2JsonRedisSerializer.class, redisTemplate.getHashValueSerializer());
    }

}
