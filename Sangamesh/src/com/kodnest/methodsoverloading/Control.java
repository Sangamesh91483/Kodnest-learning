package com.kodnest.methodsoverloading;
import java.util.Scanner;

public class Control{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Marks");
		int marks = scan.nextInt();
		System.out.println("welocome to kodnest");
		ControlApp.check(marks);
		scan.close();	
		
	}

}