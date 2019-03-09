package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pri.simon.bean.UserTag;
import pri.simon.service.UserTagService;

@Controller
@RequestMapping(value = "/userTag")
public class UserTagController {
    @Autowired
    @Qualifier(value = "userTagService")
    private UserTagService userTagService;
    @RequestMapping(value = "/insertUserTag",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public int insertUserTag(UserTag userTag){
        int flag = userTagService.insertUser(userTag);
        return flag;
    }
    @RequestMapping(value = "/updateUserTag",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    public int updateUserTag(UserTag userTag){
        int flag = userTagService.updateByPrimaryKey(userTag);
        return flag;
    }
    @RequestMapping(value = "/selectOneUserTag",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public UserTag selectOneUserTag(int tagID){
        UserTag userTag = userTagService.selectByPrimaryKey(tagID);
        return userTag;
    }
    @RequestMapping(value = "/deleteUserTag",method = RequestMethod.DELETE,produces = "application/json;charset=UTF-8")
    public int deleteUserTag(int tagID){
        int flag = userTagService.deleteByPrimaryKey(tagID);
        return flag;
    }
}
