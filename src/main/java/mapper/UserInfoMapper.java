package mapper;

import dao.UserInfo;

import java.util.ArrayList;

public interface UserInfoMapper {

    //查询User   BlogArticle
    public ArrayList<UserInfo> selectUserAndBlogArticle();
}
