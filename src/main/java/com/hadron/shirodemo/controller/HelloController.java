package com.hadron.shirodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Hadron
 * @date 2019/8/22 10:23
 */
@Controller
public class HelloController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
