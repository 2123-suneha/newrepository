package com.example.entity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UserDetailsImpl implements UserDetails {
	private String username;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public UserDetailsImpl(User user) {
		this.username = user.getEmail();
		this.password = user.getPassword();
		this.authorities = new ArrayList<GrantedAuthority>();
		this.authorities.add(new SimpleGrantedAuthority(user.getRole()));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}
 