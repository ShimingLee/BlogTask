package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pri.simon.service.AttentionUserService;

public class AttentionUserController {
    @Autowired
    @Qualifier(value = "attentionUserService")
    private AttentionUserService attentionUserService;
    @RequestMapping(value = "/findBeAttentionUser",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public AttentionUser findBeattentionUser(int tagID){
        AttentionUser attentionUser = attentionUserService.selectByPrimaryKey(tagID);
        return attentionUser;
    }
    @RequestMapping(value = "/insertAttentionUser",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    public int insertAttentionUser(AttentionUser attentionUser){
        int flag = attentionUserService.insertAttentionUser(attentionUser);
        return flag;
    }
    @RequestMapping(value = "/deleteAttentionUser",method = RequestMethod.DELETE,produces = "application/json;charset=UTF-8")
    public int deleteAttentionUser(int tagID){
        int flag = attentionUserService.deleteByPrimaryKey(tagID);
        return flag;
    }
}
