package com.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController {

	 @GetMapping("/") 
	   public String index() { 
		   System.out.println("Index page");
		   System.out.println("Inside index");
	      return "index.html"; 
	   }
}
