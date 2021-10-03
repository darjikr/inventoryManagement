package com.krunaldarji.inventoryManagement.product.service;

import java.util.List;

import com.krunaldarji.inventoryManagement.product.exception.ResourceNotFoundException;
import com.krunaldarji.inventoryManagement.product.model.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	
	Product updateProduct(Product product) throws ResourceNotFoundException;
	
	List<Product> getAllProduct();
	
	Product getProductById(long productId) throws ResourceNotFoundException;
	
	void deleteProduct(long id) throws ResourceNotFoundException;

}
