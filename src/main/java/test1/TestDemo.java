package test1;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtil;

import java.util.HashMap;

public class TestDemo {

    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);

            HashMap hashMap = userMapper.selectUser(1001);

            System.out.println(hashMap.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
