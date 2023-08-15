package com.demo.E_Commerce_SeviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.E_Com_Model.Product;
import com.demo.E_Commerce_Repo.ProductRepo;
import com.demo.E_Commerce_Service.ProductService;

@Service
public class ProductService_Impl implements ProductService{
	@Autowired
	private ProductRepo productRepo;
	
	

	@Override
	public Iterable<Product> DisplayAllProduct() {
		Iterable<Product> p= productRepo.findAll();
		return p;
	}

	//check this method why not upadate data 
	@Override
	public Product UpdateProduct(Product product) {
		Optional<Product> p=productRepo.findById(product.getPid());
		if(p.isPresent()) {
			Product updateProduct = p.get();
			updateProduct.setPname(product.getPname());
			updateProduct.setProductCatgory(product.getProductCatgory());
			updateProduct.setProductComapany(product.getProductComapany());
			updateProduct.setProductQuantity(product.getProductQuantity());
			updateProduct.setProductprice(product.getProductprice());
			updateProduct.setStockplace(product.getStockplace());
			//updateProduct.setPname(product.getPname());
	
			System.out.println("All is well");
			return productRepo.save(updateProduct);
		
			
		}
		throw new IllegalArgumentException("Product id Can't find()");
	}

	@Override
	public Optional<Product> DisplayProductById(Integer id) {
		Optional<Product> p=productRepo.findById(id);
		
		return p;
	}
	
//	@Override
//	public Product DisplayProductById(Integer id) {
//		Product p= productRepo.getUserByProduct(id);
//		return p;
//	}
	
	
	

	@Override
	public Product AddProduct(Product product) {
		Product p=productRepo.save(product);
		return p;
	}

	@Override
	public String deleteProduct(Integer id) {
		productRepo.deleteById(id);
		return ("Product Delete BY ID Sucessfully....!");
	}

	

}
