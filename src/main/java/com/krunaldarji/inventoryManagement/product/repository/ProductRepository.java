package com.krunaldarji.inventoryManagement.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krunaldarji.inventoryManagement.product.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
