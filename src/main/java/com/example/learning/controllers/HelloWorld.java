package com.example.learning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloWorld {

    @GetMapping("/greeting")
    public String getHelloWord(@RequestParam String name ) {
        return "Hello "+name.toUpperCase();
    }
    

}
