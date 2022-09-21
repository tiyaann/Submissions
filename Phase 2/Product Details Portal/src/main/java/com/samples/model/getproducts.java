package com.samples.model;

public class getproducts {

	private String productID;
	private String productName;
	private String model;
	
	// constructor
	
	public getproducts(String productID, String productName, String model) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.model = model;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}