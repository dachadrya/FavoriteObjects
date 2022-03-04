package com.bootcamp;
import java.util.ArrayList;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.IOException;

public class House {
	 
	  String make;
	  String model;
	  int year;
	  int totalRoom;
	  String type;
	  
	  public House() {
			
		}

public House(String make, String model, int year, int totalRoom, String type) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.totalRoom = totalRoom;
		this.type = type;
	}

public String getMake() {
	return make;
}

public int getTotalRoom() {
	return totalRoom;
}

public void setTotalRoom(int totalRoom) {
	this.totalRoom = totalRoom;
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