package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.AttentionArticle;
import pri.simon.bean.AttentionArticleExample;
import pri.simon.dao.AttentionArticleMapper;
import pri.simon.service.AttentionAriticleService;

import java.util.List;

@Service("attentionArticleService")
public class AttentionArticleServiceImp implements AttentionAriticleService {
    @Autowired
    private AttentionArticleMapper attentionArticleMapper;

    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        int flag = attentionArticleMapper.deleteByPrimaryKey(tagId);
        return flag;
    }

    @Override
    public int insertAttiontionArticle(AttentionArticle record) {
        int flag = attentionArticleMapper.insert(record);
        return flag;
    }

    @Override
    public AttentionArticle selectByPrimaryKey(Integer tagId) {
        AttentionArticle attentionArticle = attentionArticleMapper.selectByPrimaryKey(tagId);
        return attentionArticle;
    }

    @Override
    public int updateByPrimaryKeySelective(AttentionArticle record) {
        int flag = attentionArticleMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(AttentionArticle record) {
        int flag = attentionArticleMapper.updateByPrimaryKey(record);
        return flag;
    }

    @Override
    public List<AttentionArticle> selectByUserIDWithAttentionArticleExample(Integer userId) {
        AttentionArticleExample attentionArticleExample=new AttentionArticleExample();
        attentionArticleExample.createCriteria().andUserIdEqualTo(userId);
        List<AttentionArticle> attentionArticles=attentionArticleMapper.selectByExample(attentionArticleExample);
        return attentionArticles;
    }
}
