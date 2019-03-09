package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.AttentionUser;
import pri.simon.bean.AttentionUserExample;
import pri.simon.bean.AttentionUserKey;
import pri.simon.dao.AttentionUserMapper;
import pri.simon.service.AttentionUserService;

import java.util.List;

@Service("attentionUserService")
public class AttentionUserServiceImp implements AttentionUserService {
    @Autowired
    private AttentionUserMapper attentionUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        AttentionUserKey attentionUserKey=new AttentionUserKey();
        attentionUserKey.setUserTagId(tagId);
        int flag = attentionUserMapper.deleteByPrimaryKey(attentionUserKey);
        return flag;
    }

    @Override
    public int insertAttentionUser(AttentionUser record) {
        int flag = attentionUserMapper.insert(record);
        return flag;
    }

    @Override
    public AttentionUser selectByPrimaryKey(Integer tagId) {
        AttentionUserKey attentionUserKey=new AttentionUserKey();
        attentionUserKey.setUserTagId(tagId);
        AttentionUser attentionUser = attentionUserMapper.selectByPrimaryKey(attentionUserKey);
        return attentionUser;
    }

    @Override
    public int updateByPrimaryKeySelective(AttentionUser record) {
        int flag = attentionUserMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(AttentionUser record) {
        int flag = attentionUserMapper.updateByPrimaryKey(record);
        return flag;
    }

    @Override
    public int updateByExample(int ifAttention,int attentionUserId,int userId) {
        AttentionUserExample attentionUserExample=new AttentionUserExample();
        attentionUserExample.createCriteria().andUserIdEqualTo(userId);
        AttentionUser attentionUser=new AttentionUser();
        attentionUser.setAttentionUserId(attentionUserId);
        attentionUser.setIfAttention(ifAttention);
        int flag = attentionUserMapper.updateByExample(attentionUser,attentionUserExample);
        return flag;
    }

    @Override
    public List<AttentionUser> selectByExample(AttentionUserExample attentionUserExample) {
        List<AttentionUser> attentionUsers=attentionUserMapper.selectByExample(attentionUserExample);
        return attentionUsers;
    }
}
