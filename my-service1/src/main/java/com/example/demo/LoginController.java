package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.client.RestTemplate;
@Controller
@RequestMapping("/rest/login")
public class LoginController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	  @RequestMapping("/")
	     public String anotherMethod()
	     {
	    	 return "login";
	     }
	    
	
	@GetMapping("/callservice")
	public String invokeService(@RequestParam String name,@RequestParam String pwd)
	{  
		String url="http://AUTH-SERVICE:8094/callService/"+name+"&"+pwd;
		return restTemplate.getForObject(url, String.class);
	}

}