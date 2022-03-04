package com.bootcamp;
import java.util.ArrayList;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Phone {
	 
	  String make;
	  String model;
	  int year;
	  double price;
	  String type;
	  
	  public Phone() {
			
		}

public Phone(String make, String model, int year, int price, String type) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.type = type;
	}

public String getMake() {
	return make;
}

public double getprice() {
	return price;
}

public void setprice(double price) {
	this.price = price;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
}
