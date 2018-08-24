package main.java.service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisAdapter {
    private  static JedisPool pool;
    static {
        pool=new JedisPool("redis://localhost:6379/2");
    }

    public  static void print(int index,Object obj){
        System.out.println(String.format("%d,  %s",index,obj.toString()));
    }

    public  static Jedis getJedisConn(){
        return pool.getResource();
    }



}
