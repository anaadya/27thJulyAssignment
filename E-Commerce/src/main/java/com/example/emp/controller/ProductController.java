package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.entity.Product;
import com.example.emp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService pService;

	@GetMapping("/prodList")
	public List<Product> findAll() {
		return pService.findAll();
	}

	@GetMapping("/product/{id}")
	public Product findById(@PathVariable Integer id) throws Exception {
		Product p = pService.findById(id);

		if (p == null)
			throw new Exception(" ID : " + id + " details not available in Repository..");

		return p;
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@RequestBody Product p) {
		p.setId(0);
		pService.saveOrUpdate(p);

		return "Product details added successfully!!!";
	}

	@PutMapping("/updateproduct")
	public String updateEmployee(@RequestBody Product p) throws Exception {
	
		
		pService.saveOrUpdate(p);
		
		return "ID : "+ p.getId() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("productid/{id}")
	public String deleteById(@PathVariable int id) {
		pService.deleteById(id);
		return "ID : " + id +"details  deleted !!!";
	}
}
