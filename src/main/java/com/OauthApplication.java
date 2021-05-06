package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthApplication {
	public static void main(String ar[]) {
		SpringApplication.run(OauthApplication.class, ar);
	}
	
	/*
	 * @RequestMapping(value = "/user") public Principal user(Principal principal) {
	 * return principal; }
	 */
}
