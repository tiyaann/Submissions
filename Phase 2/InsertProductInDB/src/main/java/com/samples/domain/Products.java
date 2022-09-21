package com.samples.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Products")
public class Products {
	
	@Id
	@Column(name="productID")
	private String productID;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="modelnos")
	private String modelnos;
	
	// constructor
	
	public Products(String productID, String productName, String modelnos) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.modelnos = modelnos;
	}
	
	// Getters and Setters
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModelnos() {
		return modelnos;
	}
	public void setModelnos(String modelnos) {
		this.modelnos = modelnos;
	}

}