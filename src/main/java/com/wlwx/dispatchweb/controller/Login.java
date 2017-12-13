package com.wlwx.dispatchweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

    @RequestMapping("/login")
    public String toLogin(){
        System.out.println("提示");
        return "login";
    }

//    @RequestMapping("/login")
//    public String doLogin(){
//
//    }

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        System.out.println("主页");
        return "index";
    }

}
