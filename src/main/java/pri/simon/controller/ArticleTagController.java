package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pri.simon.service.ArticleTagService;

import java.util.List;

@Controller
@RequestMapping(value = "/articleTag")
public class ArticleTagController {
    @Autowired
    @Qualifier(value = "articleTagService")
    private ArticleTagService articleTagService;
    @RequestMapping(value = "/insertArticleTag",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    public int insertArticleTag(ArticleTag articleTag){
        int flag = articleTagService.insertArticleTag(articleTag);
        return flag;
    }
    @RequestMapping(value = "/findAllArticleTag",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public List<ArticleTag> findAllArticleTag(){

    }
    @RequestMapping(value = "/deleteArticleTag",method = RequestMethod.DELETE,produces = {"application/json;charset=UTF-8"})
    public int deleteArticleTag(int tagID){
        int flag=articleTagService.deleteByPrimaryKey(tagID);
        return flag;
    }
    @RequestMapping(value = "/updateArticleTag",method = RequestMethod.PUT,produces = {"applicaiton/json;charset=UTF-8"})
    public int updateArticleTag(ArticleTag articleTag){
        int flag = articleTagService.updateByPrimaryKey(articleTag);
        return flag;
    }
    @RequestMapping(value = "/findArticleTag",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public ArticleTag findArticleTag(int tagID){
        ArticleTag articleTag = articleTagService.selectByPrimaryKey(tagID);
        return articleTag;
    }
}





