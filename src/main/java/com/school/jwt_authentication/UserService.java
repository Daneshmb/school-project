package com.school.jwt_authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	
	@Autowired
	UserRepo repo;

	public Users signUp(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
	
	
}
