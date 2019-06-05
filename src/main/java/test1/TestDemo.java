package test1;

import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtil;

public class TestDemo {

    public static void main(String[] args) {


        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();

        SqlSession session = sqlSessionFactory.openSession();
        try {
//            User user = (User) session.selectOne("entity.User.SelectUser", 1);

            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = userMapper.selectUser(1);
            System.out.println(user.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
