package main.java.service;

import redis.clients.jedis.Jedis;

import java.util.HashSet;
import java.util.Set;

public class Follow {
    //关注列表
    private String uuid;
    private Set<String> set;

    public  static void addFollow(String uuid,String followId){
        Jedis jedis=JedisAdapter.getJedisConn();
        jedis.sadd("follow"+uuid,followId);
        jedis.close();
    }

    public  static void delFollow(String uuid,String followId){
        Jedis jedis=JedisAdapter.getJedisConn();
        jedis.srem("follow"+uuid,followId);
        jedis.close();
    }

    public void getFollow(String uuid){
        Jedis jedis=JedisAdapter.getJedisConn();
        set=jedis.spop("follow"+uuid,50);
        jedis.close();
    }
}
