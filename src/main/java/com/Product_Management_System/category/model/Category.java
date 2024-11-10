package com.Product_Management_System.category.model;

import java.util.List;

import com.Product_Management_System.model.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	private String categoryName;
	private String categoryDescription;
	private String categoryMaterial;
	
//	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<Product> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(long categoryId, String categoryName, String categoryDescription, String categoryMaterial) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryMaterial = categoryMaterial;
		
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryMaterial() {
		return categoryMaterial;
	}

	public void setCategoryMaterial(String categoryMaterial) {
		this.categoryMaterial = categoryMaterial;
	}

//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
//	

}
