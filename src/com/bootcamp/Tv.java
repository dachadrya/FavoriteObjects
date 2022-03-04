package com.bootcamp;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class Tv {
	  String make ;
	  String model;
	  int year;
	  int price;
	  String SKU;
	public Tv() {
		super();
	}
	public Tv(String make, String model, int year, int price, String sKU) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		SKU = sKU;
	}
	public String getMake() {
		return make;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	  

}