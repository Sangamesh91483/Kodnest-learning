package com.kodnest.methodsoverloading;

import java.util.Scanner;

public class Arthematic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" 2 number");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(subtract( num1,  num2));
		System.out.println(" 2 number");
	     num1 = scan.nextInt();
		 num2 = scan.nextInt();
		System.out.println(multiply( num1, num2));
		System.out.println(" 2 number");
	     num1 = scan.nextInt();
		 num2 = scan.nextInt();
		System.out.println(divide( num1,  num2));
		System.out.println(" 2 number");
		 num1 = scan.nextInt();
		 num2 = scan.nextInt();
		System.out.println(avg( num1,  num2));
		
		
		

	}
	public static int subtract(int num1, int num2) {
		return num1-num2;
	}
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
	public static double divide(int num1, int num2) {
		return num1/num2;
	}
	public static int avg(int num1, int num2) {
		return num1%num2;
	}

}
