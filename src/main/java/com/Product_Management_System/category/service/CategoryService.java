package com.Product_Management_System.category.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Product_Management_System.category.model.Category;
import com.Product_Management_System.category.repository.CategoryRepository;
import java.util.Optional;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepo;

	  public Page<Category> getAllCategories(Pageable pageable) {
	        return categoryRepo.findAll(pageable);
	    }
	public Optional<Category> getCategoryById(Long id) {
		return categoryRepo.findById(id);
	}
	
	public Category createCategory(Category category) {
		return categoryRepo.save(category);
	}

	

	public Category updateCategory(Long id, Category updatedCategory) {
		 Category category = categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
		category.setCategoryName(updatedCategory.getCategoryName());
		category.setCategoryDescription(updatedCategory.getCategoryDescription());
		category.setCategoryMaterial(updatedCategory.getCategoryMaterial());
		return categoryRepo.save(category);
	}

	public void deleteCategory(Long id) {
		categoryRepo.deleteById(id);
	}

}
