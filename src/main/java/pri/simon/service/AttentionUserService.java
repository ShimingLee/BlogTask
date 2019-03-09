package pri.simon.service;

import pri.simon.bean.AttentionUser;
import pri.simon.bean.AttentionUserExample;

import java.util.List;

public interface AttentionUserService {
    int deleteByPrimaryKey(Integer tagId);

    int insertAttentionUser(AttentionUser record);

    AttentionUser selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(AttentionUser record);

    int updateByPrimaryKey(AttentionUser record);

    int updateByExample(int ifAttention,int attentionUserId,int userId);

    List<AttentionUser> selectByExample(AttentionUserExample attentionUserExample);

}
