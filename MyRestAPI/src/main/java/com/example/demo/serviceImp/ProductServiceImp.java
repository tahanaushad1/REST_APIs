package com.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDto;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	ProductRepo productRepo;

	@Override
	public String saveData(ProductDto productDto) {
		productRepo.save(productDto);
		return "Data Save Successfully!!";
	}

	
}
