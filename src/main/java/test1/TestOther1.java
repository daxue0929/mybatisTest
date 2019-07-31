package test1;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import util.RedisUtil;

import java.io.File;

public class TestOther1 {

    @Test
    public void test002(){

        Jedis jedis = RedisUtil.getJedis();
//        System.out.println(jedis.get("1"));

        System.out.println(jedis.keys("*"));
        System.out.println(jedis.get("d"));

    }

    @Test
    public void test003(){
        File file = new File("C:\\server\\data\\dlpxqjvnavi\\100121582b642da3-89b9-4178-93a9-67313a9a8253.jpg");
        System.out.println(file.toString());
    }
}
