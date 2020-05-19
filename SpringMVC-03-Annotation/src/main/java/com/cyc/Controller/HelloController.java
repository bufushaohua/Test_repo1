package com.cyc.Controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController  {

    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","hello,SpringMVCAnnotation!");
        return "hello";  //会被视图解析器处理；
    }

    //测试前，将视图解析器注释掉
    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        session.setAttribute("msg","Spring去掉注释");
        return "redirect:hhh";
    }
}
