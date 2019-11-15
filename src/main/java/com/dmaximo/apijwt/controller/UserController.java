package com.dmaximo.apijwt.controller;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmaximo.apijwt.model.User;
import com.dmaximo.apijwt.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/signin")
	public String login(@RequestHeader String username, @RequestHeader String password) {
		return userService.signin(username, password);
	}

	@PostMapping("/signup")
	public String signup(@RequestBody User user) {
		return userService.signup(modelMapper.map(user, User.class));
	}

	@DeleteMapping(value = "/{username}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String delete(@PathVariable String username) {
		userService.delete(username);
		return username;
	}

	@GetMapping(value = "/{username}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public User search(@PathVariable String username) {
		return modelMapper.map(userService.search(username), User.class);
	}

	@GetMapping(value = "/me")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
	public User whoami(HttpServletRequest req) {
		return modelMapper.map(userService.whoami(req), User.class);
	}

	@GetMapping("/refresh")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
	public String refresh(HttpServletRequest req) {
		return userService.refresh(req.getRemoteUser());
	}

}
