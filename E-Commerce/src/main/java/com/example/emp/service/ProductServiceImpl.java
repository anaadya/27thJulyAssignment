package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.entity.Product;
import com.example.emp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		
		return repository.findAll();
	}

	
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
	public void saveOrUpdate(Product p) {
		repository.saveOrUpdate(p);
	}



//	public void update(Employee emp) {
//		repository.update(emp);
//		
//	}



	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

}
