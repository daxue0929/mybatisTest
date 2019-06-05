package test1;

import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtil;

public class TestDemo {

    public static void main(String[] args) {

        try {

            SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getFactory();
            SqlSession session = sqlSessionFactory.openSession();


//            User user = (User) session.selectOne("entity.User.SelectUser", 1);
            try {

                UserMapper userMapper = session.getMapper(UserMapper.class);
                User user = userMapper.selectUser(1);

                System.out.println(user.toString());
            } finally {
                session.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }




    }
}
