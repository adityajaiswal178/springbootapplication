package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigMapController {

    @GetMapping(value="/config")
    public String getConfig(){
        return "config..";
    }
}
