package com.pruthvitech.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruthvitech.productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>,JpaSpecificationExecutor<Product> {
//	@Query(value="select * from product where product_id =:productId",nativeQuery = true)
//	public Product findById(@Param("productId") String productId);

}


