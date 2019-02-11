package com.amisoft.login.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    String index(){
        return "hidden";
    }

    @GetMapping("/login")
    String login(){
        return "login";
    }

    @GetMapping("/logout-success")
    String logout(){
        return "logout";
    }
}
