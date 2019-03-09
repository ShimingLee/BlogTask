package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.ArticleExample;
import pri.simon.bean.ArticleTag;
import pri.simon.bean.ArticleTagExample;
import pri.simon.dao.ArticleTagMapper;
import pri.simon.service.ArticleTagService;

import java.util.List;

@Service("ArticleTagService")
public class ArticleTagServiceImp implements ArticleTagService {
    @Autowired
    ArticleTagMapper articleTagMapper;

    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        int flag = articleTagMapper.deleteByPrimaryKey(tagId);
        return flag;
    }

    @Override
    public int insertArticleTag(ArticleTag record) {
        int flag = articleTagMapper.insert(record);
        return flag;
    }

    @Override
    public ArticleTag selectByPrimaryKey(Integer tagId) {
        ArticleTag articleTag = articleTagMapper.selectByPrimaryKey(tagId);
        return articleTag;
    }

    @Override
    public int updateByPrimaryKeySelective(ArticleTag record) {
        int flag = articleTagMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(ArticleTag record) {
        int flag = articleTagMapper.updateByPrimaryKey(record);
        return flag;
    }
    @Override
    public List<ArticleTag> selectByUserIDWithArticleExample(Integer userID) {
        ArticleTagExample articleTagExample=new ArticleTagExample();
        articleTagExample.createCriteria().andUserIdEqualTo(userID);
        List<ArticleTag> articleTags=articleTagMapper.selectByExample(articleTagExample);
        return articleTags;
    }
}
