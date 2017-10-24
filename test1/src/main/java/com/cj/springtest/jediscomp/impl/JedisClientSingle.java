package com.cj.springtest.jediscomp.impl;

import com.cj.springtest.jediscomp.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Map;
import java.util.Set;


/**
 * Created by 62464 on 2017/8/24.
 */

public class JedisClientSingle implements JedisClient {

    @Autowired
    private JedisPool jedisPool;

    public void flushall(){
        Jedis jedis=jedisPool.getResource();
        jedis.flushAll();
        jedis.close();
    }
    public Set<String>  keys(String key) {
        Jedis jedis=jedisPool.getResource();
       Set<String> result=jedis.keys(key);
        jedis.close();
        return result;
    }
    public String get(String key) {
        Jedis jedis=jedisPool.getResource();
        String result=jedis.get(key);
        jedis.close();
        return result;
    }
    public String getset(String key,String value){
        Jedis jedis=jedisPool.getResource();
        String result=jedis.getSet(key,value);
        jedis.close();
        return result;
    }
    public String set(String key, String value) {
        Jedis jedis=jedisPool.getResource();
        String result=jedis.set(key, value);
        jedis.close();
        return result;
    }
    public Map<String,String> hgetAll(String hkey) {
        Jedis jedis=jedisPool.getResource();
        Map<String,String> result=jedis.hgetAll(hkey);
        jedis.close();
        return result;
    }
    public String hget(String hkey, String key) {
        Jedis jedis=jedisPool.getResource();
        String result=jedis.hget(hkey, key);
        jedis.close();
        return result;
    }


    public long hset(String hkey, String key, String value) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.hset(hkey, key, value);
        jedis.close();
        return result;
    }

    public long incr(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.incr(key);
        jedis.close();
        return result;
    }

    public long decr(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.decr(key);
        jedis.close();
        return result;
    }

    public long expire(String key, int second) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.expire(key, second);
        jedis.close();
        return result;
    }

    public long ttl(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.ttl(key);
        jedis.close();
        return result;
    }

    public long del(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.del(key);
        jedis.close();
        return result;
    }

    public long hdel(String hkey, String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.hdel(hkey, key);
        jedis.close();
        return result;
    }
    public boolean exists(String key){
        Jedis jedis=jedisPool.getResource();
        boolean result= jedis.exists(key);
        jedis.close();
        return result;
    }
}
