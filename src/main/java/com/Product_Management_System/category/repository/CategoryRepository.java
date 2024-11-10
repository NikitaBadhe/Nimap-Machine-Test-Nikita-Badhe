package com.Product_Management_System.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product_Management_System.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
