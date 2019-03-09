package pri.simon.service;

import pri.simon.bean.UserTag;

public interface UserTagService {
    int deleteByPrimaryKey(Integer tagId);

    int insertUser(UserTag userTag);

    UserTag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(UserTag userTag);

    int updateByPrimaryKey(UserTag userTag);
}
