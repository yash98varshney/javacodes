package com.springcloud.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.productservice.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
