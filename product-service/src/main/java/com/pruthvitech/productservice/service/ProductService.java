package com.pruthvitech.productservice.service;

import java.util.List;

import com.pruthvitech.productservice.controller.ProductRequest;
import com.pruthvitech.productservice.controller.ProductResponse;
import com.pruthvitech.productservice.entity.Product;

public interface ProductService {
	
	 Product createdProduct(ProductRequest productRequest);
	  
	 List<Product> getAllProducts();
	 
	 ProductResponse getProductById(long productId);
	 
	  void updateProduct( long productId );
	 
	 
	 
	   
	

}
