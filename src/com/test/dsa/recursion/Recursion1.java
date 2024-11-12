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
	
	
	

}
