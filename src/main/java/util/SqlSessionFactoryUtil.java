package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
    private static SqlSessionFactory factory = null;

    public static SqlSessionFactory getInstance(){
        if (factory == null) {
            factory = SqlSessionFactoryUtil.getFactory();
            System.out.println("返回新的对象");
            return factory;
        }else{
            
            System.out.println("返回旧的对象");
            return factory;
        }
    }

    private static SqlSessionFactory getFactory() {
        String resource = "mybatis-config.xml";

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(inputStream);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);


        return factory;
    }
}
