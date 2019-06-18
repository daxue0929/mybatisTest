package dao;

import entity.BlogArticle;
import entity.User;

public class UserInfo {

    private User user;

    private BlogArticle blogArticle;

    @Override
    public String toString() {
        return "UserInfo{" +
                "user=" + user +
                ", blogArticle=" + blogArticle +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BlogArticle getBlogArticle() {
        return blogArticle;
    }

    public void setBlogArticle(BlogArticle blogArticle) {
        this.blogArticle = blogArticle;
    }
}
