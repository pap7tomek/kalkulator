package com.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(Model model){
        return "index";
    }
    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(Model model){
        return "dashbord";
    }
}
