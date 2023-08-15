package com.demo.E_Commerce_Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.E_Com_Model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{
//	@Query("Select U from product u where u.product=:pid" )
//	public Product getUserByProduct(Integer pid);
	
//	 @Query(value = "SELECT * FROM product", nativeQuery = true)
//	    List<Product> getAllProductsUsingNativeQuery();

}
