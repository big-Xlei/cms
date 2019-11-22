package com.briup.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String hello(Map<String,Object> map) {
		map.put("name", "老王");
		
		return "hello";
	}
	
}
