package com.example.emp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id		// primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
	@Column(name="id")
	private Integer id;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="unitprice")
	private Float unitprice;
	
	@Column(name="unitsinstock")
	private Integer unitsinstock;
	
	@Column(name="datecreated")
	private String datecreated;
	
	@Column(name="lastupdated")
	private String lastupdated;
	
	@Column(name="categoryid")
	private Integer categoryid;
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Float getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(Float unitprice) {
		this.unitprice = unitprice;
	}


	public Integer getUnitsinstock() {
		return unitsinstock;
	}


	public void setUnitsinstock(Integer unitsinstock) {
		this.unitsinstock = unitsinstock;
	}


	public String getDatecreated() {
		return datecreated;
	}


	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}


	public String getLastupdated() {
		return lastupdated;
	}


	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}


	public Integer getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

}