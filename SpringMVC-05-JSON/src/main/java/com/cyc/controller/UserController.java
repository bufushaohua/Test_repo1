package com.cyc.controller;

import com.cyc.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController  直接返回字符串，不走视图解析器
@Controller
public class UserController {

    //使用这种解决JSON乱码问题的方式，所得到的文本字体会变小
    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @ResponseBody  //它就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper objectMapper = new ObjectMapper();
        //创建一个对象
        User user = new User("张三", 2, "男");
        //将我们的对象解析成json格式
        String s = objectMapper.writeValueAsString(user);
        return s;
    }
}
