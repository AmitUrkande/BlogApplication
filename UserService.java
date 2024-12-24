package com.any.service;

import java.util.List;

import com.any.payload.UserDto;

public interface UserService 
{
	//create user
	UserDto createUser(UserDto user);
	
	//update user
	UserDto updateUser(UserDto user, Integer userId);
	
	//get user by id
	UserDto getUserById(Integer userId);
	
	// get All users
	List<UserDto> getAllUsers();
	
	//Delete user
	void deleteUser(Integer userId);
	
	
}
