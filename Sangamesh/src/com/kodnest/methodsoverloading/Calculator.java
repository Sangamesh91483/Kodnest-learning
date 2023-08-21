package com.kodnest.methodsoverloading;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the values a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("enter the switch case " + c);
		switch(c)
		{
		case 1:
			int d= a + b;
			System.out.println(d);
			break;
		case 2:
			 d = a - b;
			System.out.println(d);
			break;
		case 3:
			 d = a * b;
			System.out.println(d);
			break;
		case 4:
			d = a / b;
			System.out.println(d);
			break;
		case 5:
		     d = a % b;
		     System.out.println(d);
		break;
		default:
			System.out.println("invalid case");
		}
	}
}

