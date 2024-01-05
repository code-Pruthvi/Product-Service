package com.pruthvitech.productservice.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @NotNull
	    private long productId;

	   @NotBlank
	    @Size(max = 50)
	    @NoSpecialCharacters
	    private String productName;

	    
	    private double price;
	    @NotNull
	    @Size(max = 100)
	    private String description;
	    
	    private  String  manufacturer;
	    
	    private String category;
	    
	    
	    
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


		public String getManufacturer() {
			return manufacturer;
		}
		
		


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public Product(String category) {
			super();
			this.category = category;
		}


		public Product(long productId, String productName, double price, String description, String manufacturer) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.description = description;
			this.manufacturer = manufacturer;
			
		}


		public Product() {
			super();
		}


		public static Object builder() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	}
	
	


