package com.test.dsa.recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print all Integer from 1 to N:  ");
		print1ToN(9);
		System.out.println();
		System.out.println("Print all Integer from 1 to N:  ");
		print1ToN(15);
		System.out.println();
		System.out.println("Print all Integer from N to 1:  ");
		printNTo1(9);
		System.out.println();
		System.out.println("Print all Integer from N to 1:  ");
		printNTo1(15);
		System.out.println();
		System.out.println("Print all Integer from 1 to N(Tail recursive):  ");
		print1ToN_TailRecursive(9,1);
		System.out.println();
		
		System.out.println("Print fibonacci series of first n elements:  ");
		fibonacci(15);
		System.out.println();
		
		System.out.println("Print log of number 16 with base 2: "+ logBase2(16));
		System.out.println("Print log of number 14 with base 2: "+ logBase2(14));
		
		System.out.println("Print log of number 27 with base 3: "+ logBase3(27));
		System.out.println("Print Binary representation of a number 7: ");
		decimalTOBinary(7);
		System.out.println();
		System.out.println("Print Binary representation of a number 6: ");
		decimalTOBinary(6);
		System.out.println();

	}
	public static void print1ToN(int n) {
		if(n==0) return ;
		print1ToN(n-1);
		System.out.print(n+" ");
		//this is not tail recursive
	}
	public static void printNTo1(int n) {
		if(n==0) return ;
		System.out.print(n+" ");
		printNTo1(n-1);
		//this is a Tail Recursion, as function doesnt hve anything to do after the function call
		//Tail recursive is faster, as it doesnt have to save the state to resume the execution
	}
	
	public static void print1ToN_TailRecursive(int n, int k) {
		if(n==0) return ;
		System.out.print(k+" ");
		print1ToN_TailRecursive(n-1,k+1);
		
	}
	public static void fibonacci(int n) {
		if(n==1) return ;
		System.out.print(n+" ");
		printNTo1(n-1);
	}
	public static  int logBase2(int n) {
		if(n==1) return 0;
		else return 1+ logBase2(n/2);
	}
	
	public static  int logBase3(int n) {
		if(n==1) return 0;
		else return 1+ logBase3(n/3);
	}
	
	public static void decimalTOBinary(int n) {
		if(n==0) return ;
		decimalTOBinary(n/2);
		System.out.print(n%2);
	}
	
	

}
