package com.demo.E_Commerce_Service;

import java.util.Optional;

import com.demo.E_Com_Model.Product;
import com.demo.E_Commerce_Repo.ProductRepo;


public interface ProductService {
	
	

	public Iterable<Product> DisplayAllProduct();	
	
	public Product UpdateProduct(Product product);
	
	public Optional<Product> DisplayProductById(Integer id);
	//public Product DisplayProductById(Integer id);//native query fail 
	
	public Product AddProduct(Product product);
	
	public String deleteProduct(Integer id);
	
	
}
