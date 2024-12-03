package com.Product_Management_System.category.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	private String categoryName;
	private String categoryDescription;
	private String categoryMaterial;
	

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


}
