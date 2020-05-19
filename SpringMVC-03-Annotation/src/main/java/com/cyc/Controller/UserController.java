package com.cyc.Controller;

import com.cyc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    //url:localhost:8080/t1?name=UserController.test1方法
    @GetMapping("/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        return "hhh";
    }

    //url:localhost:8080/t1?username=UserController.test2方法
    @RequestMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        return "hhh";
    }

    @GetMapping("/hhh")
    public String test3(String id, Model model){
        model.addAttribute("id",id);
        return "hhh";
    }

    /**
     * 1. 接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     * 2. 假设传递的是一个对象User，匹配User对象中的字段名：如果名字一致则OK，否则匹配不到
     */

    @GetMapping("/t3")
    public String test3(User user){
        System.out.println(user);
        return "hhh";
    }

}
