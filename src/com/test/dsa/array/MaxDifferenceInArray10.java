package com.test.dsa.array;

/* Given an array , find out the maximum difference between any two elements such that the larger element
 *  appears after the smaller number.  arr[j]-arr[i] such that j>i
 * I/P a={2, 3, 10, 6, 4, 8, 1}
 * O/P :  8 (The maximum difference is between 10 and 2)
 * I/P arr[] =  {7, 9, 5, 6, 3, 2}
 * O/P: 2 The maximum difference is between 9 and 7.
 *  * I/P arr[] =  {30, 10, 8, 2}
 * O/P: -2 The maximum difference is between 8 and 10.
 * */

public class MaxDifferenceInArray10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={2, 3, 10, 6, 4, 8, 1}; 
		int a[]= {30, 10, 8, 2};
		int d=2;
		System.out.println("Original array");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();


		System.out.println("Maxx difference _ Method1");
		MaxDiff_Method1(a);

		int a1[]={2, 3, 10, 6, 4, 8, 1,2};  

		System.out.println("Maxx difference _ Method2");
		MaxDiff_Method2(a1);

	}

	/*
	 * Naive Approach : We use two loops in this approach. The outer loop runs from 0 to size – 1 and 
	 * one by one picks all elements from left to right. The inner loop compares the picked element 
	 * to all the elements on its right side. If the picked element and current elements difference is
	 * greater than previous greater, update with new value.
	 */
	//O(n*n) time and O(1) space
	public static void MaxDiff_Method1(int arr[]) {
		int maxDiff=Integer.MIN_VALUE ;
		// int maxDiff=arr[1]-arr[0] ;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				maxDiff=Math.max(maxDiff, arr[j]-arr[i]);
			}
		}

		System.out.println(maxDiff);
	}

	/*
	 * Efficient Approach: The idea is to scan all the elements from right to left in an array and 
	 * keep track of the maximum till now. When the maximum changes its value, print it.
	 */
	//O(n) time and O(1) space
	public static void MaxDiff_Method2(int arr[]) {
		int maxDiff=arr[1]-arr[0];
		int minValue=arr[0];

		for(int i=0;i<arr.length;i++) {
			maxDiff=Math.max(maxDiff, arr[i]-minValue);
			minValue=Math.min(minValue, arr[i]);
		}
		System.out.println(maxDiff);//--> discuss this solution

	}
}
