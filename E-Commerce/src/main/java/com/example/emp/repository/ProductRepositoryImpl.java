package com.example.emp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.emp.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	EntityManager entityManager;
	
	public List<Product> findAll() {
		Session currentSession  = entityManager.unwrap(Session.class);
		// select * from Employee 
		Query<Product> query = currentSession.createQuery("select p from Product p",Product.class);
		
		List<Product> prodList = query.getResultList(); 
		return prodList;
	}

	
	public Product findById(Integer id) {
		Session currentSession  = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}
	
	@Transactional
	public void saveOrUpdate(Product p) {
		Session currentSession  = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(p);
	}

	@Transactional
	public void deleteById(int empId) {
		
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :id");
		query.setParameter("id",id);
		query.executeUpdate();
	}

}
