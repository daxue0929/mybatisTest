package mapper;

import entity.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserMapper {

    //通过用户id来查询用户的信息
    public HashMap selectUser(int id);

    //通过用户名,查询该用户的信息
    public HashMap selectUserByUserName(String Name);

    //通过用户组名,查询该用户组下有哪些用户
    public ArrayList<User> selectUserByGroupName(String groupName);

}
