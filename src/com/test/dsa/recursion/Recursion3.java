package com.test.dsa.recursion;

public class Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
