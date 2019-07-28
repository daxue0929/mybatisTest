package mapper;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserMapper{

    //通过用户id来查询用户的信息
    User selectUser(int id);

    //通过用户名,查询该用户的信息
    HashMap selectUserByUserName(String Name);

    //通过用户组名,查询该用户组下有哪些用户
    ArrayList<User> selectUserByGroupName(String groupName);

    @Select("select * from user where ${column} = #{value}")
    User selectUserByColumn(@Param("column") String column, @Param("value") String value);

    //添加一个用户  .添加成功返回1
    void insert(User user);

    void deleteById(int userId);

    void updateById(User user);
}
