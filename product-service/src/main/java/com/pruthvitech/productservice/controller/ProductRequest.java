package com.pruthvitech.productservice.controller;



public class ProductRequest {
	 private String name;
	 private double price;
	 private String description;
	 private String category;
	 private String manufacturer;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public ProductRequest(String name, double price, String description, String category,
			String manufacturer) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
		this.manufacturer = manufacturer;
		
	}
	public ProductRequest() {
		super();
	}
	
	
	 

}
