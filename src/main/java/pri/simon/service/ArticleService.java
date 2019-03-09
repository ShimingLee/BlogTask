package pri.simon.service;

import org.springframework.stereotype.Service;
import pri.simon.bean.Article;
import pri.simon.bean.ArticleExample;

import java.util.List;

@Service("articleService")
public interface ArticleService {
    int deleteByPrimaryKey(Integer articleId);

    int insertArticle(Article record);

    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
    List<Article> selectArticleList();
    List<Article> selectByExample(ArticleExample articleExample);
    List<Article> selectByUserIDWithAttentionArticleExample(Integer userId);
    List<Article> selectByUserIDAndTagIDWithAttentionArticleExample(Integer userId, Integer tagId);
}
