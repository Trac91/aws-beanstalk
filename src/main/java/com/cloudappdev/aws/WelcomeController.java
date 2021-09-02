package com.cloudappdev.aws;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController{
    @GetMapping
    public String welcome(){
        return "<h1>Welcome to Cloud Application Development! /n This application used the Following Cloud services: ElasticBeanstalk, EC2,S3, CodeBuild, CodeDeploy and Cloudwatch!!!!<h1/>";

    }
}