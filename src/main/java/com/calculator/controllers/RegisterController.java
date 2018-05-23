package com.calculator.controllers;

import com.calculator.model.User;
import com.calculator.security.SecurityService;
import com.calculator.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private SecurityService securityService;

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
    public String registerPost(String username, String password , Model model){
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        userService.save(u);
        securityService.autologin(u.getUsername(), u.getPasswordConfirm());
        return "dashboard";
    }
}
