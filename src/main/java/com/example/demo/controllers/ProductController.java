package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;


@RestController
@RequestMapping("rest/api/product")

public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@PostMapping("/create")
	public String create(@Valid @RequestBody Product productObj){
		repo.save(productObj);
		return "success";
	}
	
}
