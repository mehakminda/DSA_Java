package com.test.dsa.recursion;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Print sum of first n natura number: "+ sumNaturalNumb(5));
		System.out.println("Print sum of digits of a number 154 : "+ sumofDigits(14));
		
		System.out.println("Print factorial number 5  "+ fact(5));
		System.out.println("Print the nth fibonacci number:  "+fibonacci(5));
		System.out.println("Print the nth fibonacci number:  "+fibonacci(1));
		//0,1,1,2,3,5,8,13,....
		System.out.println();

	}
	public static int  sumNaturalNumb(int n) {
		if(n==0) return 0;
		return n+ sumNaturalNumb(n-1);
	}
	public static int  sumofDigits(int n) {
		if(n==0) return 0;
		return n+ sumNaturalNumb(n-1);
	}
	public static int  fact(int n) {
		if(n==0) return 1;
		return n* fact(n-1);
	}
	
	public static int fibonacci(int n) {
		if(n==1) return 1;
		if(n<=0) return 0 ;
		return fibonacci(n-1)+fibonacci(n-2);
		
	}

}
