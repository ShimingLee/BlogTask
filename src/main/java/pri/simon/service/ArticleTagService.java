package pri.simon.service;

import org.springframework.stereotype.Service;
import pri.simon.bean.ArticleExample;
import pri.simon.bean.ArticleTag;

import java.util.List;

@Service("articleTagService")
public interface ArticleTagService {
    int deleteByPrimaryKey(Integer tagId);

    int insertArticleTag(ArticleTag record);

    ArticleTag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(ArticleTag record);

    int updateByPrimaryKey(ArticleTag record);
    List<ArticleTag> selectByUserIDWithArticleExample(Integer userID);
}
