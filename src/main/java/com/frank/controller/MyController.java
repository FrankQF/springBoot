package com.frank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.config.MyConfig;
@RestController
public class MyController {
	@Autowired
	private MyConfig helloConfig;


    @RequestMapping("/hello")
    String hello() {
        return "Hello World";
    }
    
    @RequestMapping("/json")
    public RspDTO json() {
    	RspDTO rspDTO = new RspDTO();
    	rspDTO.setName("qifang");
    	rspDTO.setAge("18");
    	return rspDTO;
    }
}
