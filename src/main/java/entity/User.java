package entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;
    private String userPassword;
    private Date addTime;
    private Integer groupId;
    private Integer glod;

    public User(Integer userId, String userName, String userPassword, Date addTime, Integer groupId, Integer glod) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.addTime = addTime;
        this.groupId = groupId;
        this.glod = glod;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", addTime=" + addTime +
                ", groupId=" + groupId +
                ", glod=" + glod +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGlod() {
        return glod;
    }

    public void setGlod(Integer glod) {
        this.glod = glod;
    }
}
