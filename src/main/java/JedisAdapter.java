import redis.clients.jedis.Jedis;

public class JedisAdapter {

    public  static void print(int index,Object obj){
        System.out.println(String.format("%d,  %s",index,obj.toString()));
    }

    public  static void main(String[]rag){
        Jedis jedis=new Jedis("redis://localhost:6379/9");
        jedis.set("hello","world");
        System.out.println(jedis.get("hello"));
    }

}
