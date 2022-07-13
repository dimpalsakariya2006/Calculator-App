package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0 ,num1,num2;
		Scanner myObj = new Scanner(System.in);
	    while(choice <5)
		{
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		System.out.println("Select operation:  ");
		choice = myObj.nextInt();
		System.out.println("Enter Number:  ");
		num1 = myObj.nextInt();
		System.out.println("Enter Another Number  ");
		num2 = myObj.nextInt();
		switch(choice)
		{
			case 1:
				add(num1, num2);
				System.out.println("Addition is: " + (num1+num2));
				break;
			case 2:
				sub(num1,num2);
				System.out.println("Substraction is: " + (num1-num2));
				break;
			case 3:
				mul(num1,num2);
				System.out.println("Multiplication is: " + (num1*num2));
				break;
			case 4:
				div(num1,num2);
				System.out.println("Division is: " + (num1/num2));
				break;
				}
		}

	}

	static int add(int num1, int num2)
	{
		// TODO Auto-generated method stub
		return num1+num2;
	}
	static int sub(int num1, int num2)
	{
		// TODO Auto-generated method stub
		return num1-num2;
	}
	static int mul(int num1, int num2)
	{
		// TODO Auto-generated method stub
		return num1*num2;
	}
	static int div(int num1, int num2)
	{
		// TODO Auto-generated method stub
		return num1/num2;
	}
}
