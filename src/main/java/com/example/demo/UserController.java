package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
@Autowired
UserService userService;
@GetMapping("/users")
public List<User> getUsers(){
	return userService.getAllUsers();
}

@PostMapping("/user")
public void saveBooks(@RequestBody User user) {
  userService.save(user);
}
@DeleteMapping("/users/{id}")
public void delete(@PathVariable int id) {
	userService.delete(id);
}
}