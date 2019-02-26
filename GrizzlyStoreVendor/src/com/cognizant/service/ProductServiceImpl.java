package com.cognizant.service;

import java.io.InputStream;
import java.util.List;

import com.cognizant.dao.ProductDAO;
import com.cognizant.entity.Product;
import com.cognizant.helper.FactoryProductDAO;

public class ProductServiceImpl implements ProductService{
	
	ProductDAO productDAO=FactoryProductDAO.createProductDAO();

	@Override
	public boolean checkProduct(int productId, String productCategory) {
		// TODO Auto-generated method stub
		boolean result=productDAO.checkProduct(productId, productCategory);
		
		return result;
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		boolean result=productDAO.addProduct(product);
		return result;
	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		List<Product> productList=productDAO.viewProducts();
		return productList;
	}

	public boolean updateVendorQuantity(int productId, int vendorId,
			int quantity) {
		// TODO Auto-generated method stub
		return productDAO.updateVendorQuantity(productId, vendorId, quantity);
	}

	@Override
	public List<Product> getProducts(int vendorId) {
		// TODO Auto-generated method stub
		return productDAO.getProducts(vendorId);
	}

}
