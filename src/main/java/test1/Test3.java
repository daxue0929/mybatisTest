package test1;

import mapper.BlogArticleMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Test3 {

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();

        //
        BlogArticleMapper blogArticleMapper = session.getMapper(BlogArticleMapper.class);

        //测试查询当前用户的博文列表有哪些
        ArrayList<HashMap> blogArticleArr = blogArticleMapper.queryBlogArticleByUserId(1007);
        if (!blogArticleArr.isEmpty()){
            System.out.println("该用户发表了" + blogArticleArr.size() + "篇博文!");
            for(Object blogArticleItem : blogArticleArr){
                System.out.println(blogArticleItem);
            }
        }else{
            System.out.println("当前用户没有发表的博客文章");
        }


    }
}
