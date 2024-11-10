package com.Product_Management_System.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import com.Product_Management_System.model.Product;
import com.Product_Management_System.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create Product
    @PostMapping
    public String createProduct(@RequestBody Product product,@RequestParam Long id) {
        productService.createProduct(product, id);
        return "Product Inserted Successfully";
    }

    // Get All Products
    @GetMapping
    public List<Product> getAllProducts(@RequestParam int page, @RequestParam int size) {
        return productService.getAllProducts(PageRequest.of(page, size)).getContent();
        
    }

    // Get Product by ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // Update Product
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
         productService.updateProduct(id, productDetails);
         return "Product Updated Successfully";
    }

    // Delete Product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product Deleted Successfully";
    }
}

