import main.java.service.JedisAdapter;
import redis.clients.jedis.Jedis;

import java.util.UUID;

public class Test {

    public  static void main(String[]args){
        Bean bean=new Bean("a","aa");
        UUID uuid=UUID.randomUUID();
        bean.addUser(uuid);


        Bean bean1=new Bean("b","aa");
        UUID uuid1=UUID.randomUUID();
        bean1.addUser(uuid1);


        Bean bean2=new Bean("c","aa");
        UUID uuid2=UUID.randomUUID();
        bean2.addUser(uuid2);
        Jedis jedis=JedisAdapter.getJedisConn();

        JedisAdapter.print(1,jedis.hgetAll(uuid1.toString()));
        
    }
}
