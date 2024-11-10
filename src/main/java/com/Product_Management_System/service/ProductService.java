package com.Product_Management_System.service;


import com.Product_Management_System.category.model.Category;
import com.Product_Management_System.category.repository.CategoryRepository;
import com.Product_Management_System.model.Product;
import com.Product_Management_System.repository.ProductRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;
    
    @Autowired
    private CategoryRepository categoryRepo;
    
    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepo.findById(id);
    }

    public Product createProduct(Product product,Long categoryId) {
    	Category category = categoryRepo.findById(categoryId).orElseThrow(()-> new RuntimeException("Catagory Not Found"));
    	product.setCategory(category);
         return productRepo.save(product);
       
    }

    public Product updateProduct(Long id, Product productDetails) {
    	 Product product = productRepo.findById(id)
    	            .orElseThrow(() -> new RuntimeException("Product not found"));
    	 
        product.setProductName(productDetails.getProductName());
        product.setProductManuDate(productDetails.getProductManuDate());
        product.setProductPrice(productDetails.getProductPrice());
        
        return productRepo.save(product);
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}

