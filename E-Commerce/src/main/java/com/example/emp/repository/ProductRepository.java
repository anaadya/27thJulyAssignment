package com.example.emp.repository;

import java.util.List;

import com.example.emp.entity.Product;

public interface ProductRepository {
	public List<Product> findAll();
	public Product findById(Integer id);
	public void saveOrUpdate(Product p);
	
	public void deleteById(int id);

}