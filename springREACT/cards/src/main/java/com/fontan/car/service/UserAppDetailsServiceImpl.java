package com.fontan.car.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.
Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.
User.UserBuilder;
import org.springframework.security.core.userdetails.
UserDetails;
import org.springframework.security.core.userdetails.
UserDetailsService;
import org.springframework.security.core.userdetails.
UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fontan.car.domain.UserApp;
import com.fontan.car.domain.UserAppRepository;

@Service
public class UserAppDetailsServiceImpl implements
UserDetailsService {
	@Autowired
	private UserAppRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserApp> user =  repository.findByUsername(username);
		UserBuilder builder = null;
		if (user.isPresent()) {
			UserApp currentUser = user.get();
			builder = User.withUsername(username);
			builder.password(currentUser.getPassword());
			builder.roles(currentUser.getRole());
		} else {
			throw new UsernameNotFoundException("User not found.");
		}
		return builder.build();
	}
}