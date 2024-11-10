package com.Product_Management_System.category.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Product_Management_System.category.model.Category;
import com.Product_Management_System.category.service.CategoryService;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	 public List<Category> getAllCategories(@RequestParam int page, @RequestParam int size) {
        return categoryService.getAllCategories(PageRequest.of(page, size)).getContent();
    }

	@PostMapping
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);
	}

	@GetMapping("/{id}")
	public Optional<Category> getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}

	@PutMapping("/{id}")
	public String updateCategory(@PathVariable Long id, @RequestBody Category category) {
		 categoryService.updateCategory(id, category);
		 return "Category Updated Successfully";
	}

	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
	}
}
