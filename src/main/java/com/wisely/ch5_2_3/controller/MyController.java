package com.wisely.ch5_2_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {

    @RequestMapping("/hello")
    String hello() {
    	System.out.println("hello");
        return "Hello Spring Boot!";
    }
}
