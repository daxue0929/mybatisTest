package test1;

import mapper.BlogArticleMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import util.SqlSessionFactoryUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Test3 {

    @Test
    public void test5() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        BlogArticleMapper blogArticleMapper = session.getMapper(BlogArticleMapper.class);



    }


    /**
     * 测试方法,多参数传输测试方法,以HashMap的方式传输多参数
     */
    @Test
    public void test4(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        BlogArticleMapper blogArticleMapper = session.getMapper(BlogArticleMapper.class);

        HashMap hashMap = new HashMap();

        hashMap.put("userId1", 1001);
        hashMap.put("userId2",1007);

        ArrayList blogArticleArrayList = blogArticleMapper.queryBlogArticleByUserIds(hashMap);
        if (!blogArticleArrayList.isEmpty()){
            System.out.println("该用户发表了" + blogArticleArrayList.size() + "篇博文!");
            for(Object blogArticleItem : blogArticleArrayList){
                HashMap blogArticleItemHashMap = (HashMap)blogArticleItem;
                System.out.println(blogArticleItemHashMap.get("article_title"));
            }
        }else{
            System.out.println("当前用户没有发表的博客文章");
        }
    }

    //主方法
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
