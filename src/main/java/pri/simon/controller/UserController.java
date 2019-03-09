package pri.simon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pri.simon.bean.User;
import pri.simon.service.UserService;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    @Qualifier(value = "userService")
    private UserService userService;

    @RequestMapping(value = "/insertUserMessage",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public int insertUserMessage(@RequestBody User user){
        int flag;
        List<User> selectUsers=userService.selectByExample(user.getUsername());
        if(selectUsers.size()>0){
            return 0;
        }else {
            flag = userService.insertUser(user);
        }
        return flag;
    }
    @RequestMapping(value = "/findUserMessage",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public User findUserMessage(@RequestParam int userId){
        User userMessage = userService.selectByPrimaryKey(userId);
        return userMessage;
    }

    @RequestMapping(value = "/updateUserMessage",method = RequestMethod.PUT,produces ={"application/json;charset=UTF-8"})
    public int updateUserMessage(@RequestBody User user){
        int flag = userService.updateByPrimaryKeySelective(user);
        return flag;
    }
@RequestMapping(value = "/deleteUserMessage",method = RequestMethod.DELETE,produces = {"application/json;charset=UTF-8"})
    public int deleteUserMessage(@RequestParam int userId){
        int flag= userService.deleteByPrimaryKey(userId);
        return flag;
    }

    public List<User> findAllUsersMessage(){
        List<User> userList=userService.selectUserList();
        return userList;
    }
}
