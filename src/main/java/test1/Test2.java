package test1;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        HashMap hashMap = userMapper.selectUserByUserName("大雪");
        
        System.out.println(hashMap);
        System.out.println("-------------");

        ArrayList userArr = userMapper.selectUserByGroupName("普通用户");
        for(Object userItem : userArr){
            System.out.println(userItem);
        }

    }
}
