package com.any.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.any.entity.User;
import com.any.exception.ResourceNotFoundException;
import com.any.repository.UserRepo;

public class CustomUserDetailService implements UserDetailsService
{
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{

		// loding user from database
		User user = this.userRepo.findByEmail(username).orElseThrow(() -> new ResourceNotFoundException("User", "email : " + username, 0));
		
		
		
		return user;
	}

}
