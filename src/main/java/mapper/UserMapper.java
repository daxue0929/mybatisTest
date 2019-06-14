package mapper;

import entity.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserMapper {

    public HashMap selectUser(int id);

    public HashMap selectUserByUserName(String Name);

    public ArrayList<User> selectUserByGroupName(String groupName);

}
