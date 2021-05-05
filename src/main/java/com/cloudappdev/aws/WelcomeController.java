package com.cloudappdev.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController{

    @GetMapping
    public String welcome(){
        return "Welcome to Cloud Application Development!";
    }

}