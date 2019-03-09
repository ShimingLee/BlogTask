package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pri.simon.bean.Comment;
import pri.simon.service.CommentService;

@Controller
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    @Qualifier(value = "commentService")
    private CommentService commentService;
    @RequestMapping(value = "/insertComment",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public int insertComment(@RequestBody Comment comment){
        int flag = commentService.insertComment(comment);
        return flag;
    }
    @RequestMapping(value = "/updateComment",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    public int updateComment(@RequestBody Comment comment){
        int flag = commentService.updateByPrimaryKey(comment);
        return flag;
    }
    @RequestMapping(value = "/selectComment",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Comment selectComment(@RequestParam int tagID){
        Comment comment = commentService.selectByPrimaryKey(tagID);
        return comment;
    }
    @RequestMapping(value = "/deleteComment",method = RequestMethod.DELETE,produces = "application/json;charset=UTF-8")
    public int deleteComment(@RequestParam int tagID){
        int flag = commentService.deleteByPrimaryKey(tagID);
        return flag;
    }

}
