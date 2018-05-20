package com.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class RegisterController {
    @Autowired
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
