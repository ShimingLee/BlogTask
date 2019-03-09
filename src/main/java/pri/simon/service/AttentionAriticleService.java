package pri.simon.service;

import pri.simon.bean.AttentionArticle;

import java.util.List;

public interface AttentionAriticleService {
    int deleteByPrimaryKey(Integer tagId);

    int insertAttiontionArticle(AttentionArticle record);

    AttentionArticle selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(AttentionArticle record);

    int updateByPrimaryKey(AttentionArticle record);
    List<AttentionArticle> selectByUserIDWithAttentionArticleExample(Integer userId);
}
