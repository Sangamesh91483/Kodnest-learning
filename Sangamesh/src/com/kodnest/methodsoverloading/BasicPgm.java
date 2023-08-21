package com.kodnest.methodsoverloading;

import java.util.Scanner;

public class BasicPgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		String str = sc.next();
		String org_str=str;
		String rev="";
		int len = str.length();
		for(int i=len-1; i<=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_str==rev)
		{
			System.out.println("pal");
			
		}
		else
		{
			System.out.println("not");
		}
	}
}
/*
int n1 = sc.nextInt()
;		int org_num=n1;
	int rev=0;

	while(n1 !=0)
	{
		rev=rev*10+n1%10;
		n1=n1/10;
	
	}
	
*/