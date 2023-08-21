package com.kodnest.methodsoverloading;

import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("enter two number");
		long a1 = scan.nextLong();
		long b1 = scan.nextLong();
	
System.out.println(galaceticAddition(a1, b1));
	}
	
	public static  long galaceticAddition(long a ,long b) 
	{
		return  a + b ;
		
	}

}
