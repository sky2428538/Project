package cn.bdqn.controller;

import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/index.hmtl")
    public String index(Model model){
        User user=userService.getUserById("1");
        model.addAttribute("user",user);
        return "index";
    }

    public String login(){
        return  "";
    }
}
