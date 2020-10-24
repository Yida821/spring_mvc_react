package com.yichun.controller;

import com.yichun.model.AppUser;
import com.yichun.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    @RequestMapping(value = "/test")
//    public String test () {
//        return "test";
//    }
@Autowired
AppUserService appUserService;


    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }

    @RequestMapping(value = "/addAppUser")
    public String addAppUser(){
        appUserService.insertAppUser(new AppUser(1, "user", "pass"));
        return "home";
    }
}
