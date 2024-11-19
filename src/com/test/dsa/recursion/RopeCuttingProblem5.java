package com.test.dsa.recursion;

/* We have a rope of length n, our job is to cut the rope in max pieces such that each pieces if of length a/b/c
 * 0<a,b,c<=n
 * 
 * I/P: n=5 a=2 b=5 c=1
 * O/P: 5 (We can max 5 pieces of length 1)
 * 
 * I/P: n=23 a=12 b=9 c=11
 * O/P: 2 (We can 2 pieces of length 11 and 12)
 * 
 * I/P: n=5 a=4 b=2 c=6
 * O/P: -1 (not possible)
 * */

public class RopeCuttingProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5; int a=2 ;int b=5 ;int c=1;
		System.out.println("The max pieces the rop can be cut is: "+ maxPieces(n,a,b,c));
		
		n=5; a=4; b=2; c=6;
		System.out.println("The max pieces the rop can be cut is: "+ maxPieces(n,a,b,c));
		
	}
	public static int  maxPieces(int n, int a, int b, int c) {
		if(n==0) return 0;
		if(n<0) return -1;
		int res=Math.max(maxPieces(n-a,a,b,c),Math.max(maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c)));
		if(res==-1) return -1;
		return res+1;
		
	}
}
