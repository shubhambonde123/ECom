package com.demo.E_Commerce_Repo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.E_Com_Model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{	
	
	//user Repository/Duo
//	@Query("select u from User u")
//	public ResponseEntity<List<User>> getAllUser();
}
