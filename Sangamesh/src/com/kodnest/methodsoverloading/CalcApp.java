package com.kodnest.methodsoverloading;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		Calc Calc= new Calc(num1,num2);
		Calc.add();
		Calc.sub();
		Calc.mul();
		Calc.div();
		scan.close();
		
	}

}
