package com.kodnest.methodsoverloading;

public class Calc {
	int num1;
	int num2;
	 
	public Calc(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;

}
  void add()
	{
		int res = num1+num2;
		System.out.println(res);
	}
  
  void sub()
	{
		int res = num1-num2;
		System.out.println(res);
	}
  void mul()
	{
		int res = num1*num2;
		System.out.println(res);
	}
 void div()
	{
		int res = num1/num2;
		System.out.println(res);
	}
	
}