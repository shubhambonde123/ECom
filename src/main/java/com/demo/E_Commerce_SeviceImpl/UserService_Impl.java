package com.demo.E_Commerce_SeviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.E_Com_Model.User;
import com.demo.E_Commerce_Repo.UserRepo;
import com.demo.E_Commerce_Service.UserService;

@Service
public class UserService_Impl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User CreateUser(User u) {
		User user= userRepo.save(u);
		return user;
	}

	@Override
	public User UpdateUser(User u) {
		Optional<User> user=userRepo.findById(u.getUid());
		if(user.isPresent()) {
			User use=user.get();
			use.setUname(u.getUname());
			use.setUmobile(u.getUEmail());
			use.setUgender(u.getUgender());
			use.setUaddress(u.getUaddress());
			return userRepo.save(use);
		}
			
		else {
			throw new IllegalArgumentException("User is not Found Uid");
		}
		
	}

	@Override
	public String DeletaUser(Integer id ) {
		userRepo.deleteById(id);
		return "Delete User Sucessfully.....!!!!";
	}

	@Override
	public Optional<User> FindUserById(Integer id) {
		Optional<User> u= userRepo.findById(id);
		return u;
	}

	@Override
	public Iterable<User> FindallUser() {
		Iterable<User> u = userRepo.findAll();
		return u;
	}
	

}
