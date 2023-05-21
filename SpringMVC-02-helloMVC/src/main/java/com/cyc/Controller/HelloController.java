package com.cyc.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * 实现接口Controller定义控制器是较老的方法
 *     缺点：一个控制器中只有一个方法，如果要多个方法则需要定义多个Controller
 */

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        //ModelAndView 模型视图
        ModelAndView modelAndView = new ModelAndView();
        //封装对象
        modelAndView.addObject("msg","hello , Spring MVC !");
        //封装要跳转的视图，到ModelAndView中
        modelAndView.setViewName("hello");
        modelAndView.setViewName("hello1");
        return modelAndView;
    }

}
