package com.bitnationcode.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/greeting")
    public String index() {
        return "Welcome from Spring Boot!";
    }
}
