package com.tka.writer_reader;

import java.io.Serializable;

public class Product  implements Serializable{
	int id;
	String name;
	double Price;
	
	public Product() {
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		Price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Price=" + Price + "]";
	}
	
	

}
