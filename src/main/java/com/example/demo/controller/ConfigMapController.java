package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConfigMapController {
    @Value("${username}")
    private String username;


    @GetMapping(value="/config")
    public String getConfig(){
        return "Username is: "+username;
    }
}
