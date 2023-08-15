package com.demo.E_Commerce_Service;

import java.util.Optional;

import com.demo.E_Com_Model.User;

public interface UserService {		//Create,Update ,delete user
	public User CreateUser(User u);
	
	public User UpdateUser(User u);
	
	public Optional<User> FindUserById(Integer id);
	
	public Iterable<User> FindallUser();
	
	public String DeletaUser(Integer id);

}
