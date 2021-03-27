package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.repo.User;

public interface UserRepo extends CrudRepository<User,Integer> {

}
