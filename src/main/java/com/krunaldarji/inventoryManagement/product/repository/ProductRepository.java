package com.krunaldarji.inventoryManagement.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krunaldarji.inventoryManagement.product.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Optional<Product> findByUpcNumber(String upcNumber);

}
