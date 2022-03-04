package com.bootcamp;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class Computer {
	  String make ;
	  String type ;
	  String model;
	  int year;
	  int price;
	public Computer(String make, String type, String model, int year, int price) {
		super();
		this.make = make;
		this.type = type;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Computer() {
		super();
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [make=" + make + ", type=" + type + ", model=" + model + ", year=" + year + ", price=" + price
				+ "]";
	}
	  	
	  
	   // dayasHome.make = "Rayan";
	  //  dayasHome.model = "Alcott";
	   // dayasHome.year = 2021;
	   	   
	    }
