package com.jsp.car;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
@Id
	private int id;
private String brand;
private String name;
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
}
