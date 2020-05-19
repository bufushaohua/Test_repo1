package com.cyc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {

    //路径的名称是value或者path，不是name
    @RequestMapping(value = "/delete/{a}/{b}",method = RequestMethod.GET)
    public String test1(@PathVariable int a,@PathVariable int b , Model model){
        int res = a + b;
        model.addAttribute("result","结果为：" + res);
        return "hello";
    }
}
