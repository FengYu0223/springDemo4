package com.cj.springtest.jediscomp;

import java.util.Map;
import java.util.Set;

/**
 * Created by 62464 on 2017/8/24.
 */
public interface JedisClient {
    String get(String key);
    String set(String key, String value);
    String hget(String hkey, String key);
    long hset(String hkey, String key, String value);
    long incr(String key);
    long decr(String key);
    long expire(String key, int second);
    long ttl(String key);
    long del(String key);
    long hdel(String hkey, String key);
    public void flushall();
    public Set<String> keys(String key);
    public boolean exists(String key);
    String getset(String key,String value);
}
