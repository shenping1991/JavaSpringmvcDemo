package com.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @ResponseBody
    @RequestMapping(value="/index")
    public String index(){
        System.out.println("index controller");
        return "index";
    }

    @RequestMapping(value="/test")
    public String Test(Model model){
        System.out.println("test controller");
        model.addAttribute("name","jsp page");
        return "Test";
    }
}

