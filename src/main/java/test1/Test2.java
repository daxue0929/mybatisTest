package test1;


import entity.User;
import mapper.UserMapper;
import org.junit.Test;
import util.RandomUtil;
import util.SqlSessionFactoryUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 对用户的操作封装方法,CURD
 */
public class Test2 {

    public UserMapper userMapper;

    {
        userMapper = SqlSessionFactoryUtil.getInstance().openSession(true).getMapper(UserMapper.class);
    }

//    public static void main(String[] args) {
////
////        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
////        SqlSession session = sqlSessionFactory.openSession();
////
////        UserMapper userMapper = session.getMapper(UserMapper.class);
////        HashMap hashMap = userMapper.selectUserByUserName("大雪");
////
////        System.out.println(hashMap);
////        System.out.println("-------------");
////
////        ArrayList userArr = userMapper.selectUserByGroupName("普通用户");
////        for (Object userItem : userArr) {
////            System.out.println(userItem);
////        }
////
////    }

    @Test
    public void addUser() {

        User user = new User(null, "test" + RandomUtil.getInstance(10000), "123456", new Date(), 7, RandomUtil.getInstance(100));

//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
//        SqlSession session = sqlSessionFactory.openSession();
//
//        UserMapper userMapper = session.getMapper(UserMapper.class);

        userMapper.insert(user);
//        session.commit();


    }

    @Test
    public void deleteUser() {
        /**
         * openSession(true)   自动提交
         */
        UserMapper userMapper = SqlSessionFactoryUtil.getInstance().openSession(true).getMapper(UserMapper.class);
        userMapper.deleteById(1008);

    }



    @Test
    public void updateUser() {

        userMapper.updateById(
                new User(1015, "test" + RandomUtil.getInstance(10000), "654321", new Date(), 8, RandomUtil.getInstance(100))
        );


    }

    @Test
    public void Test001() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i = 0; i < list.size(); i++) {
            if (i == 1) {
                list.remove(i);
            }
        }
        for (Integer j : list) {
            System.out.print(j + "  ");
        }

    }


    String  str = new String("good");
    char[]  ch= {'a','d','c'};

    public static void main(String args[]){
        Test2 ex=new Test2();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);

    }
    public static void change(String str ,char ch[] ) {
        str = "test ok";
        ch[1]='g';
    }

}
