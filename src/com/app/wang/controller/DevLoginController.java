package com.app.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DevLoginController {
    @RequestMapping(value = "/dev/login")
    public String devLogin(){
        System.out.println("dev");
        return "devlogin";
    }
    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    public String doLogin(@RequestParam String devCode,@RequestParam String devPassword){
        //用户名密码判空

        return "";
    }
}
