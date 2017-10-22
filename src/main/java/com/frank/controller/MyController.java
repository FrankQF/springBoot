package com.frank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.config.MyConfig;
import com.frank.spring_boot.starter_hello.HelloService;
@RestController
public class MyController {
	@Autowired
	private MyConfig helloConfig;
	@Autowired
	private HelloService helloService;

    @RequestMapping("/hello")
    String hello() {
    	System.out.println("abc"+helloService.getMsg());
        return "Hello World";
    }
}
