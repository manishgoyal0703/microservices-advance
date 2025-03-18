package sprint1.redis;

import java.util.Map;

public interface RedisService {
    void save(String key, Object value);
    Object get(String key);

    void saveHash(String key, String hashKey, Object value);
    Object getHash(String key, String hashKey);

    void saveHashWithExpiry(String key, String hashKey, Object value, long expirySeconds);
}
