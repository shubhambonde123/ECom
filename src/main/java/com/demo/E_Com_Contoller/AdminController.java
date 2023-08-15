package com.demo.E_Com_Contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.E_Com_Model.Product;
import com.demo.E_Com_Model.User;
import com.demo.E_Commerce_SeviceImpl.ProductService_Impl;
import com.demo.E_Commerce_SeviceImpl.UserService_Impl;


@RestController
@RequestMapping("/E_Commerce")
public class AdminController {
	
	@Autowired
	private UserService_Impl userService_Impl;
	
//	@Autowired
//	private ProductRepo productRepo;
//	
//	@Autowired
//	private UserRepo userRepo;
//	
	
	@Autowired
	private ProductService_Impl productService_Impl;
	
	//User
	
	
	@PostMapping("/Useradd")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User u= userService_Impl.CreateUser(user);
		return ResponseEntity.ok().body(u);
		
	}
	
	@PutMapping("/User/upadte/{Uid}")
	public ResponseEntity<User> updateuser(@RequestBody User user){
		User r= userService_Impl.UpdateUser(user);
		 return ResponseEntity.ok().body(r);
	}
	
	@GetMapping("Userfindbyid/{uid}")
	public ResponseEntity<Optional<User>> userdeletebyid(@PathVariable ("uid") Integer uid){
		Optional<User> u= userService_Impl.FindUserById(uid);
		return ResponseEntity.ok().body(u);
		
	}
	
	@GetMapping("/Findalluser")
	public ResponseEntity<Iterable<User>> FindAllUser(){
		Iterable<User> u= userService_Impl.FindallUser();
		return ResponseEntity.ok().body(u);
	}
	
	@DeleteMapping("/User/delete/{id}")
	public ResponseEntity<String> Delete(@PathVariable ("uid") Integer uid){
		String s= userService_Impl.DeletaUser(uid);
		return ResponseEntity.ok().body(s);
		
	}
	
	//Product 
	@PostMapping("/product/add")
	public ResponseEntity<Product> ProductADD(@RequestBody Product product){
		Product p=productService_Impl.AddProduct(product);
		return ResponseEntity.ok().body(p);
	}
	
	@GetMapping("/getAllProduct")
	public ResponseEntity<Iterable<Product>> Getallproduct(){
		Iterable<Product> p=productService_Impl.DisplayAllProduct();
		return ResponseEntity.ok().body(p);
	}
	
	@GetMapping("/productgetbyid/{pid}")
	public ResponseEntity<Optional<Product>> productGetById(@PathVariable("pid") Integer pid){
		 //Product p= productRepo.getUserByProduct(pid);
		Optional<Product> p = productService_Impl.DisplayProductById(pid);
		return ResponseEntity.ok().body(p);
		
	}
	
	@PutMapping("/updateProduct/{pid}")
	public ResponseEntity<Product> UpdateById(@RequestBody Product p){
		Product temp =productService_Impl.UpdateProduct(p);
		 
		return ResponseEntity.ok().body(temp);
	} 
	
	@DeleteMapping("/deleteProduct/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable("pid") Integer pid){
		String s=productService_Impl.deleteProduct(pid);
		return ResponseEntity.ok().body(s);
	}
	
//	@GetMapping("/getpname/{Pname}")
//	public ResponseEntity<Product> findProduct(@RequestBody Product p){
//		
//	}
//	

}
