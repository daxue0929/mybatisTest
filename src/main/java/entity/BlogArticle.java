package entity;

import java.util.Date;

public class BlogArticle {
    private int articleId;
    private String articleTitle;
    private int userId;
    private String articleContent;
    private Date articleDate;

    @Override
    public String toString() {
        return "BlogArticle{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", userId=" + userId +
                ", articleContent='" + articleContent + '\'' +
                ", articleDate=" + articleDate +
                '}';
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }
}
