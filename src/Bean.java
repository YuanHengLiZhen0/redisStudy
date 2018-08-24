import main.java.service.JedisAdapter;
import redis.clients.jedis.Jedis;

import java.util.UUID;

public class Bean {
   private String user;
   private String password;

   public  Bean(String user,String password){
       this.user=user;
       this.password=password;
   }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addUser(UUID uuid){
        Jedis jedis= JedisAdapter.getJedisConn();
        jedis.hset(uuid.toString(),"user",user);
        jedis.hset(uuid.toString(),"password",password);
        jedis.close();
    }

    public  void setUserUUID(UUID uuid){
        Jedis jedis= JedisAdapter.getJedisConn();
        jedis.set(user,uuid.toString());
        jedis.close();
    }

    public  void getUserUUID(){
        Jedis jedis= JedisAdapter.getJedisConn();
        jedis.get(user);
        jedis.close();
    }

    public  void deleteUser(UUID uuid){
        Jedis jedis= JedisAdapter.getJedisConn();
        jedis.hdel(uuid.toString());
        jedis.close();
    }
}

