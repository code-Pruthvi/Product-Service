package com.pruthvitech.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruthvitech.productservice.entity.Product;
import com.pruthvitech.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
    @Autowired
    private ProductService productService;
    
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
        Product createProduct = productService.createdProduct(productRequest);
        return new ResponseEntity<>(createProduct, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        if (!products.isEmpty()) {
            return new ResponseEntity<>(products, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @GetMapping("/id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") long productId) {
    	ProductResponse productResponse
                = productService.getProductById(productId);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePrice( @PathVariable("id") long productId , @RequestBody Product updatedProduct ){
            productService.updateProduct(productId);
            return new ResponseEntity<>(HttpStatus.OK);
    
            }
}
        
        
            

