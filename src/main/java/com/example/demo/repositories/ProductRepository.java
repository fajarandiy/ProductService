package com.example.demo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Product;
import com.example.demo.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query("select pr from Product pr where pr.name like concat('%',:name, '%')")
	Iterable<Product> findByName (@Param ("name") String name);
	
	Iterable<Product> findByType (@Param ("type") String type);
}
