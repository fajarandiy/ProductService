package com.example.demo.controllers;

import java.util.Map;

import javax.persistence.PersistenceUnits;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.util.BaseUtil;


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
	
	@GetMapping("/getProductAll")
	public Iterable<Product> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById (@PathVariable(value="id") Integer productId) {
		return repo.findById(productId).get();
	}
	
	@PostMapping("/getProductByType")
	public Iterable<Product> getProductByType (@Valid @RequestBody Map productMap) {
		return repo.findByType((String) productMap.get("productType"));
	}
	
	@PostMapping("/getProductByName")
	public Iterable<Product>  getProductById (@Valid @RequestBody Map productMap) {
		return repo.findByName((String) productMap.get("productName"));
	}
	
	@GetMapping("/deleteProductById/{id}")
	public Boolean deleteProduct (@PathVariable(value="id") Integer productId) {
		repo.deleteById(productId);
		return true;
	}
	
	@PostMapping("/updateProductById/{id}")
	public Product updateProductById (@Valid @RequestBody Product productObj, @PathVariable(value="id") Integer productId) {
		Product productFromDB = repo.findById(productId).get();
		BaseUtil.setObjectFromObject(productFromDB, productObj);
		repo.save(productFromDB);
		return productFromDB;
	}
	
	
}
