package com.krunaldarji.inventoryManagement.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krunaldarji.inventoryManagement.product.exception.ResourceNotFoundException;
import com.krunaldarji.inventoryManagement.product.model.entity.Product;
import com.krunaldarji.inventoryManagement.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	  	@Autowired
	    private ProductService productService;

	  	@GetMapping("")
		public ResponseEntity<List<Product>> getAllProduct() {
				return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
		}

	    @GetMapping("{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable long id) throws ResourceNotFoundException {
	        return new ResponseEntity(productService.getProductById(id), HttpStatus.OK );
	    }

	    @PostMapping("")
	    public ResponseEntity <Product> createProduct(@RequestBody Product product) {
	    	return new ResponseEntity(productService.createProduct(product), HttpStatus.CREATED );
	    }

	    @PutMapping("{id}")
	    public ResponseEntity <Product> updateProduct(@PathVariable long id, @RequestBody Product product) throws ResourceNotFoundException {
	        product.setId(id);
	        return new ResponseEntity(productService.updateProduct(product), HttpStatus.OK );
	    }

	    @DeleteMapping("{id}")
	    public ResponseEntity deleteProduct(@PathVariable long id) throws ResourceNotFoundException {
	        productService.deleteProduct(id);
	        return new ResponseEntity(HttpStatus.OK);
	    }
}
