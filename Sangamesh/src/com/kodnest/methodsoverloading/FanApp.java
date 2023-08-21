package com.kodnest.methodsoverloading;

public class FanApp {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		Fan f3 = new Fan();
		
        f1.noOfWings=5;
        
		f1.cost=5000;
		f1.brand="crompton";
		f1.color="white";
		 
		
		System.out.println(f1.noOfWings);
		System.out.println(f1.cost);
		System.out.println(f1.brand);
		System.out.println(f1.color);
		System.out.println("=============================================");
		
		f1.fanCanRotate();
		f1.fanCanBlowAir();
		
		f2.noOfWings=4;
		f2.cost=4000;
		f2.brand="crompton";
		f2.color="green";
	
		
		System.out.println(f2.noOfWings);
		System.out.println(f2.cost);
		System.out.println(f2.brand);
		System.out.println(f2.color);
		System.out.println("++++++++++++++++++++++++bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		
		f2.fanCanRotate();
		f2.fanCanBlowAir();
		
		
		f3.noOfWings=3;
		f3.cost=3000;
		f3.brand="crompton";
		f3.color="black";
		 
				
		System.out.println(f3.noOfWings);
		System.out.println(f3.cost);
		System.out.println(f3.brand);
		System.out.println(f3.color);
		
		
		f3.fanCanRotate();
		f3.fanCanBlowAir();
	}

}
