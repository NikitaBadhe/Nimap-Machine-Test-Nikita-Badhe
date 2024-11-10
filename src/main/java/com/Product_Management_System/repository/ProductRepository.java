package com.Product_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product_Management_System.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
