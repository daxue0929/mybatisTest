package mapper;

import java.util.ArrayList;

public interface BlogArticleMapper {
    //通过外键user_id查询,当前user_id用户发表的博文列表有哪些
    public ArrayList queryBlogArticleByUserId(int userId);
}
