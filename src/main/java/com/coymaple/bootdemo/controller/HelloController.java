package com.coymaple.bootdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object> sayHello(){
		Map<String,Object> map = new HashMap<>();
		map.put("message", "Hello Spring Boot");
		return map;
	}
}
