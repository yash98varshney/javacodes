package com.springweb.productrestapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.productrestapi.Entities.products;

public interface ProductRepository extends JpaRepository<products,Integer> {
    
}
