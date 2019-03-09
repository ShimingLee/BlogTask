package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.UserTag;
import pri.simon.dao.UserTagMapper;
import pri.simon.service.UserTagService;

@Service("userTagService")
public class UserTagServiceImp implements UserTagService {
    @Autowired
    private UserTagMapper userTagMapper;

    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        int flag = userTagMapper.deleteByPrimaryKey(tagId);
        return flag;
    }

    @Override
    public int insertUser(UserTag userTag) {
        int flag = userTagMapper.insert(userTag);
        return flag;
    }

    @Override
    public UserTag selectByPrimaryKey(Integer tagId) {
        UserTag userTag = userTagMapper.selectByPrimaryKey(tagId);
        return userTag;
    }

    @Override
    public int updateByPrimaryKeySelective(UserTag userTag) {
        int flag = userTagMapper.updateByPrimaryKeySelective(userTag);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(UserTag userTag) {
        int flag = userTagMapper.updateByPrimaryKey(userTag);
        return flag;
    }
}
