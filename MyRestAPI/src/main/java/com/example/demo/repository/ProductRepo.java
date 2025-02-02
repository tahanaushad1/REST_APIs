package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	void save(ProductDto productDto);

}
