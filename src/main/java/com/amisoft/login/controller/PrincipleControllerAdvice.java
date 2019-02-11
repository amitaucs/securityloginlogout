package com.amisoft.login.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

@ControllerAdvice
public class PrincipleControllerAdvice {

    @ModelAttribute("currentUser")
    Principal principal(Principal p){
        return p;
    }
}
