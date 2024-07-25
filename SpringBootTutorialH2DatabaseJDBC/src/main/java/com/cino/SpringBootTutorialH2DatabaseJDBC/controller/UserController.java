package com.cino.SpringBootTutorialH2DatabaseJDBC.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cino.SpringBootTutorialH2DatabaseJDBC.model.Users;
import com.cino.SpringBootTutorialH2DatabaseJDBC.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/crud")
@RequiredArgsConstructor
public class UserController {

private final UserService userService;
	
	@GetMapping
	public List<Users> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
	
	@PostMapping
	public Users createUser(@RequestBody Users user) {
		return userService.createUser(user);
	}
	
	@PutMapping
	public Users updateUser(@RequestBody Users user) {
		return userService.updateUser(user);
	}
	
	@PatchMapping
	public Users patchUser(@RequestBody Users user) {
		return userService.patchUser(user);
	}
	
	@DeleteMapping
	public void deleteUser(@RequestBody Users user) {
		userService.deleteUser(user);
	}
	
	
}
