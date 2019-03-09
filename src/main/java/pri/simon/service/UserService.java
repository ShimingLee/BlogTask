package pri.simon.service;

import pri.simon.bean.User;
import pri.simon.bean.UserExample;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer tagId);

    int insertUser(User user);

    User selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
    List<User> selectUserListStateEqualsValue(int stateValue);
    List<User> selectUserList();
    List<User> selectByExample(String userName);
}
