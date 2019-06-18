package test1;

import dao.UserInfo;
import entity.Comment;
import mapper.CommentMapper;
import mapper.UserInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import util.SqlSessionFactoryUtil;

public class Test4 {

    @Test
    public void test2(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        UserInfoMapper userInfoMapper = session.getMapper(UserInfoMapper.class);

        UserInfo userInfo = userInfoMapper.getUserAndBlogArticle();
        System.out.println(userInfo);

    }


    public void test1() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        CommentMapper commentMapper = session.getMapper(CommentMapper.class);  //获取映射器

        Comment comment = commentMapper.selectOneById(1);

        if (comment != null){
            System.out.println(comment.toString());
        }
    }
}
