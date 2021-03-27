package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserRepo;
import com.example.demo.repo.User;
@Service
public class UserService {
	@Autowired
     UserRepo userRepo;
	
	public List<User> getAllUsers() {
		List<User> users=new ArrayList<User>();
		userRepo.findAll().forEach(user1->users.add(user1));
		return users;
	}
	public void save(User user) {
		userRepo.save(user);
	}
	
	public void delete(int id) {
		userRepo.deleteById(id);
		
	}

}
