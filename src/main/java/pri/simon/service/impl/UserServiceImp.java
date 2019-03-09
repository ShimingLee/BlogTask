package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.User;
import pri.simon.bean.UserExample;
import pri.simon.dao.UserMapper;
import pri.simon.service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        int flag = userMapper.deleteByPrimaryKey(tagId);
        return flag;
    }

    @Override
    public int insertUser(User user) {
        int flag = userMapper.insert(user);
        return flag;
    }

    @Override
    public User selectByPrimaryKey(Integer tagId) {
        User user = userMapper.selectByPrimaryKey(tagId);
        return user;
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        int flag = userMapper.updateByPrimaryKeySelective(user);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(User user) {
        int flag = userMapper.updateByPrimaryKey(user);
        return flag;
    }

    @Override
    public List<User> selectUserList() {
        List<User> users=userMapper.selectAllItem();
        return users;
    }

    @Override
    public List<User> selectUserListStateEqualsValue(int stateValue) {
        UserExample userExample=new UserExample();
        UserExample.Criteria userStateExampleCriteria=userExample.createCriteria().andStateEqualTo(stateValue);
        List<User> users=userMapper.selectByExample(userExample);
        return users;
    }

    public List<User> selectByExample(String userName){
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName);
        List<User> users=userMapper.selectByExample(userExample);
        return users;
    }
}
