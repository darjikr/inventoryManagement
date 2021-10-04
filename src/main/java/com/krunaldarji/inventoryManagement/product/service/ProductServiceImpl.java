package com.krunaldarji.inventoryManagement.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunaldarji.inventoryManagement.product.exception.ResourceNotFoundException;
import com.krunaldarji.inventoryManagement.product.model.entity.Product;
import com.krunaldarji.inventoryManagement.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) throws ResourceNotFoundException{
		Product productDb = getProductById(product.getId());
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(long productId) throws ResourceNotFoundException  {
		Product product =  productRepository.findById(productId).orElseThrow(()->  new ResourceNotFoundException("Product","id",""+productId));
		return product;
	}

	@Override
	public void deleteProduct(long id) throws ResourceNotFoundException {
		productRepository.delete(getProductById(id));
	}

	@Override
	public Product getProductByUpcNumber(String upcNumber) throws ResourceNotFoundException {
		Product product =  productRepository.findByUpcNumber(upcNumber).orElseThrow(()->  new ResourceNotFoundException("Product","upc number",""+upcNumber));
		return product;
	}

}
