package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pri.simon.bean.Article;
import pri.simon.bean.ArticleExample;
import pri.simon.service.ArticleService;

import java.util.List;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {
    @Autowired
    @Qualifier(value = "articleService")
    private ArticleService articleService;

    @RequestMapping(value = "/insertArticle", method = RequestMethod.PUT, produces = {"application/json;charset=UTF-8"})
    public int insertAtricle(@RequestBody Article article) {
        int flag = articleService.insertArticle(article);
        return flag;
    }

    @RequestMapping(value = "/findOneArticle", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Article findOneArticle(@RequestParam int userId) {
        Article article = articleService.selectByPrimaryKey(userId);
        return article;
    }

    @RequestMapping(value = "/findOneArticleOfYours", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Article findOneArticleOfYours(@RequestParam int articleID) {
        Article article = articleService.selectByPrimaryKey(articleID);
        return article;
    }

    @RequestMapping(value = "/findAllArticleOfYours", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<Article> findAllArticleOfYours(@RequestParam int userID) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andUserIdEqualTo(userID);
        List<Article> articles = articleService.selectByExample(articleExample);
        return articles;
    }

    @RequestMapping(value = "/updateArticle", method = RequestMethod.PUT, produces = {"application/json;charset=UTF-8"})
    public int updateArticle(@RequestBody Article article) {
        int flag = articleService.updateByPrimaryKey(article);
        return flag;
    }

    @RequestMapping(value = "/deleteArticle", method = RequestMethod.DELETE, produces = {"application/json;charset=UTF-8"})
    public int deleteArticle(@RequestParam int articleID) {
        int flag = articleService.deleteByPrimaryKey(articleID);
        return flag;
    }
}
