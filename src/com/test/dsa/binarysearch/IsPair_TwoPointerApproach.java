package com.test.dsa.binarysearch;


/* Given a array(sorted order), determine whether there exists a pair of integers in the array that adds up to a given target value.
 * 
 * I/P arr= {2,5,8,12,30} x=17
 * 	 O/P : True
 *      
 * I/P arr= {3,8,13,18} x=14
 * 	 O/P : false
 * 
 * */
public class IsPair_TwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,12,30};
		int x=17;
		System.out.println("Is a pair possible(Method1) : "+isPair_Method1(arr, x));
		System.out.println("Is a pair possible(Method2) : "+isPair_Method2(arr, x));
		
		System.out.println();
		int arr2[]= {3,8,13,18};
		int x2=14;
		System.out.println("Is a pair possible(Method1) : "+isPair_Method1(arr2, x2));
		System.out.println("Is a pair possible(Method2) : "+isPair_Method2(arr2, x2));
		
	}
	
	//O(n*n) time and O(1) space
	public static boolean isPair_Method1(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println("The pair are: ("+ arr[i]+","+arr[j]+") for sum "+x);
					return true;
				}
			}
		}
		return false;
	}
	
	//O(n) time and O(1) space
	public static boolean isPair_Method2(int arr[],int x) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if (arr[i]+arr[j]>x) j--;
			else if (arr[i]+arr[j]<x) i++;	
			else {
				System.out.println("The pair are: ("+ arr[i]+","+arr[j]+") for sum "+x);
				return true;
				}	
		}
		return false;
	}
	
	/*
	 * What if the array is unsorted?
	 */

}
