package com.cyc.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        //ModelAndView 模型视图
        ModelAndView modelAndView = new ModelAndView();
        //封装对象
        modelAndView.addObject("msg","hello , Spring MVC !");
        //封装要跳转的视图，到ModelAndView中
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
