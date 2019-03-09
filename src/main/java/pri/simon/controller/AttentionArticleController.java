package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pri.simon.bean.AttentionArticle;
import pri.simon.service.AttentionAriticleService;

@Controller
@RequestMapping(value = "/attentionArticle")
//attention article don't have delete function
public class AttentionArticleController {
    @Autowired
    @Qualifier(value = "attentionArticleService")
    private AttentionAriticleService attentionAriticleService;
    @RequestMapping(value = "/findBeAttentionArticle",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public AttentionArticle findBeAttentionArticle(int tagID){
        AttentionArticle attentionArticle = attentionAriticleService.selectByPrimaryKey(tagID);
        return attentionArticle;
    }
    @RequestMapping(value = "/insertAttentionArticle",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    public int insertAttentionArticle(AttentionArticle attentionArticle){
        int flag = attentionAriticleService.insertAttiontionArticle(attentionArticle);
        return flag;
    }
    @RequestMapping(value = "/deleteAttentionArticle",method = RequestMethod.DELETE,produces = "application/json;charset=UTF-8")
    public int deleteAttentionArticle(int tagID){
        int flag = attentionAriticleService.deleteByPrimaryKey(tagID);
        return flag;
    }
}
