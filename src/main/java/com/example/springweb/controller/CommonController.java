package com.example.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    @RequestMapping("/login")
    public String loginPage(){
        return "";
    }

    @RequestMapping("/home")
    public String homePage(){
        return "index";
    }
}
