package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.MessageResponse;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@GetMapping("/allusers")
	 public MessageResponse allAccess() {
        return new MessageResponse("Public ");
    }
}
