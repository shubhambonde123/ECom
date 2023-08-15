package com.demo.E_Com_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private	int pid;
	private String pname;
	private String Stockplace;
	private String ProductComapany;
	private String ProductCatgory;
	private int Productprice;
	private int ProductQuantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getStockplace() {
		return Stockplace;
	}
	public void setStockplace(String stockplace) {
		Stockplace = stockplace;
	}
	public String getProductComapany() {
		return ProductComapany;
	}
	public void setProductComapany(String productComapany) {
		ProductComapany = productComapany;
	}
	public String getProductCatgory() {
		return ProductCatgory;
	}
	public void setProductCatgory(String productCatgory) {
		ProductCatgory = productCatgory;
	}
	public int getProductprice() {
		return Productprice;
	}
	public void setProductprice(int productprice) {
		Productprice = productprice;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", Stockplace=" + Stockplace + ", ProductComapany="
				+ ProductComapany + ", ProductCatgory=" + ProductCatgory + ", Productprice=" + Productprice
				+ ", ProductQuantity=" + ProductQuantity + "]";
	}
	
	
}
