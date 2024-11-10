package com.Product_Management_System.model;


import com.Product_Management_System.category.model.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private String productName;
	private int productPrice;
	private String productManuDate;
	@ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productId, String productName, int productPrice, String productManuDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productManuDate = productManuDate;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductManuDate() {
		return productManuDate;
	}

	public void setProductManuDate(String productManuDate) {
		this.productManuDate = productManuDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
