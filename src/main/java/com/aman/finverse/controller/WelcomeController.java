package com.aman.finverse.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to FinVerse!";
    }    
}
