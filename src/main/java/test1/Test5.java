package test1;

import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import util.SqlSessionFactoryUtil;

public class Test5 {

    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        /**
         * userName 元数据
         * value    查询的列的值
         */
        User user = userMapper.selectUserByColumn("userName", "大雪");
        System.out.println(user);
    }
}