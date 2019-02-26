package com.cognizant.service;

import java.io.InputStream;
import java.util.List;

import com.cognizant.entity.Product;

public interface ProductService {
	
	boolean checkProduct(int productId,String productCategory);
	boolean addProduct(Product product);
	List<Product> viewProducts();
	boolean updateVendorQuantity(int productId,int vendorId,int quantity);
	List<Product> getProducts(int vendorId);
}
