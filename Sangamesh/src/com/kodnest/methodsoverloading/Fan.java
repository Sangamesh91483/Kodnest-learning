package com.kodnest.methodsoverloading;

public class Fan {
	int noOfWings;
	int cost;
	String brand;
	String color;
	
	void fanCanRotate()
	{
		System.out.println("Fan can certainly roate of "+color+"and brand name "+brand+"it has "+noOfWings+"its cost is"+cost);
	}
	void fanCanBlowAir()
	{
		System.out.println("if blow air can acessed fan can certainly blow air "+color+" color");
	}
}
