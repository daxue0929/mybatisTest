package test1;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtil;

public class Test3 {

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();

        //
        UserMapper userMapper = session.getMapper(UserMapper.class);

        //测试博文列表的持久层

    }
}
