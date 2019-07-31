package test1;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import util.RedisUtil;

public class Test6 {
    @Test
    public void test001(){
        Jedis jedis = RedisUtil.getJedis();

        jedis.set("1", "第一个数据");

        System.out.println(jedis.get("1"));
    }




    
    
}
