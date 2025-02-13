package com.cino.SpringBootTutorialH2DatabaseJDBC.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.cino.SpringBootTutorialH2DatabaseJDBC.model.Users;
import com.cino.SpringBootTutorialH2DatabaseJDBC.service.UsersService;


@RestController
@RequiredArgsConstructor
public class UsersController {
	
private final UsersService usersService;
	
	@GetMapping("/user")
	public List<Users> getUsers() {
		return usersService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public Users getUserById(@PathVariable Integer id) {
		return usersService.getUserById(id);
	}
	
	@PostMapping("/user")
	public Users createUser(@RequestBody Users user) {
		return usersService.createUser(user);
	}
	
	@PostMapping("/users")
	public List<Users> createAllUser(@RequestBody List<Users> users) {
		return usersService.createAllUser(users);
	}
	
	@PutMapping("/user")
	public Users updateUser(@RequestBody Users user) {
		return usersService.updateUser(user);
	}
	
	@PatchMapping("/user")
	public Users patchUser(@RequestBody Users user) {
		return usersService.patchUser(user);
	}
	
	@DeleteMapping("/user")
	public void deleteUser(@RequestBody Users user) {
		usersService.deleteUser(user);
	}
}
