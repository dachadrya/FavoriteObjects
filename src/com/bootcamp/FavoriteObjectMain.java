package com.bootcamp;

public class FavoriteObjectMain {

	public FavoriteObjectMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalculator=new Calculator("sony", "Ti85", 2000, 100, "sss");
		System.out.println("calculator type :"+myCalculator.getPrice());
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getModel());
	
	}

}
