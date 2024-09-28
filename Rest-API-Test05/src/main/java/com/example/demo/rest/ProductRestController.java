package com.example.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product.Product;

@RestController
public class ProductRestController {
	@GetMapping(value="/product",
			produces = {"application/xml","application/json"}
	)
	public ResponseEntity<Product>getProduct(){
		Product p1= new Product(101, "Laptop", 2000.00);
		return new ResponseEntity<>(p1,HttpStatus.OK);	
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>>getListProduct(){
		Product p1= new Product(101, "Laptop", 2000.00);
		Product p2= new Product(101, "Mouse", 1000.00);
		Product p3= new Product(101, "RAM", 500.00);
		List<Product> list = Arrays.asList(p1,p2,p3);
		return new ResponseEntity<>(list,HttpStatus.OK);
		
		
		
	}

}
