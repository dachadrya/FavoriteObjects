package com.bootcamp;
import java.util.ArrayList;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


public class Calculator {
	 
	  String make;
	  String model;
	  int year;
	  double price;
	  String type;
	  
	  public Calculator() {
			
		}

public Calculator(String make, String model, int year, int price, String type) {
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

public double getPrice() {
	return price;
}

public void setPrice(double price) {
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

@Override
public String toString() {
	return "Calculator [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", type=" + type
			+ "]";
}

}
