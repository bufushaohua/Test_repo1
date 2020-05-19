package com.cyc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @PostMapping("/e/t")
    public String test(Model model,String name){
        model.addAttribute("msg",name);
        return "hello";
    }

}
