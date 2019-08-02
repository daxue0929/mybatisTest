package test1;

import mapper.UserMapper;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import util.RedisUtil;

import java.io.File;

public class TestOther1 extends Thread {

    public UserMapper userMapper;
    {
       // userMapper = SqlSessionFactoryUtil.getInstance().openSession(true).getMapper(UserMapper.class);
    }

    @Test
    public void test001(){
        for(int i = 0; i < 10; i++){
            TestOther1 testOther1 = new TestOther1();
            testOther1.start();
        }

    }

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
        System.out.println(file.exists());
        System.out.println(file.toString());
    }


    @Test
    public void test004(){
        File file = new File("D:\\Program Files\\Java\\apache-tomcat-8.5.30\\webapps\\ccgatbo\\asset\\upload\\vtour");

        boolean exists = file.exists();
        
        System.out.println(exists);
    }




    public void run() {


    }
}
