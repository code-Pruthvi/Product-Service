package com.pruthvitech.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruthvitech.productservice.controller.ProductRequest;
import com.pruthvitech.productservice.controller.ProductResponse;
import com.pruthvitech.productservice.customexception.ProductServiceCustomException;
import com.pruthvitech.productservice.entity.Product;
import com.pruthvitech.productservice.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2

public class ProductServiceImpl  implements  ProductService{
	
	  @Autowired
	  private ProductRepository productRepository;

	  @Override
	  public Product createdProduct(ProductRequest productRequest) {
       
    

	   Product newProduct= new Product();
	   newProduct.setProductName(productRequest.getName());
	   newProduct.setPrice(productRequest.getPrice());
	   newProduct.setDescription(productRequest.getDescription());
	   newProduct.setCategory(productRequest.getCategory());
	   newProduct.setManufacturer(productRequest.getManufacturer());
	        
	        return productRepository.save(newProduct);
	        
	    }

	  @Override
	  public  List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products=productRepository.findAll();
		
		return products;
	   }

	  @Override
	
		// TODO Auto-generated method stub
	  public void updateProduct(long productId) {
	    

	        Product product
	                = productRepository.findById(productId)
	                .orElseThrow(() -> new ProductServiceCustomException(
	                        "Product with given Id not found",
	                        "PRODUCT_NOT_FOUND"
	                ));
	        
	        product.setPrice(productId);
	        productRepository.save(product);
	      
	  }
	
	@Override
	 public ProductResponse getProductById(long productId) {
      // log.info("Get the product for productId: {}", productId);

        Product product
                = productRepository.findById(productId)
               .orElseThrow(
                       () -> new ProductServiceCustomException("Product with given id not found","PRODUCT_NOT_FOUND"));

        ProductResponse productResponse
                = new ProductResponse();

        copyProperties(product, productResponse);

        return productResponse;
    }

	private void copyProperties(Product product, ProductResponse productResponse) {
		// TODO Auto-generated method stub
		
	}

}
