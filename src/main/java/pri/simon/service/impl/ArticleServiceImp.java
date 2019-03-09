package pri.simon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.simon.bean.Article;
import pri.simon.bean.ArticleExample;
import pri.simon.dao.ArticleMapper;
import pri.simon.service.ArticleService;

import java.util.List;

@Service("ArticleService")
public class ArticleServiceImp implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int deleteByPrimaryKey(Integer articleId) {
        int flag = articleMapper.deleteByPrimaryKey(articleId);
        return flag;
    }

    @Override
    public int insertArticle(Article record) {
        int flag = articleMapper.insert(record);
        return flag;
    }

    @Override
    public Article selectByPrimaryKey(Integer articleId) {
        Article article = articleMapper.selectByPrimaryKey(articleId);
        return article;
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        int flag = articleMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        int flag = articleMapper.updateByPrimaryKey(record);
        return flag;
    }

    @Override
    public List<Article> selectArticleList() {
        List<Article> articles=articleMapper.selectAllItem();
        return articles;
    }

    @Override
    public List<Article> selectByExample(ArticleExample articleExample) {
        List<Article> articles=articleMapper.selectByExample(articleExample);
        return articles;
    }
    @Override
    public List<Article> selectByUserIDAndTagIDWithAttentionArticleExample(Integer userId, Integer tagId) {
        ArticleExample articleExample=new ArticleExample();
        articleExample.createCriteria().andUserIdEqualTo(userId);
        articleExample.createCriteria().andTagIdEqualTo(tagId);
        List<Article> articles=articleMapper.selectByExample(articleExample);
        return articles;
    }

    @Override
    public List<Article> selectByUserIDWithAttentionArticleExample(Integer userId) {
        ArticleExample articleExample =new ArticleExample();
        articleExample.createCriteria().andUserIdEqualTo(userId);
        List<Article> articles=articleMapper.selectByExample(articleExample);
        return articles;
    }
}
