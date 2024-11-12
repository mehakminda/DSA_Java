package com.test.dsa.array;


/* Given an array , find the largest element in array
 * I/P a={10, 20, 4}
 * O/P : 20
 * I/P arr[] = {20, 10, 20, 4, 100}
 * O/P: 100
 * */

public class LargestElementInArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={10, 20, 4};
		System.out.println(largestElement(a));
		int []arr = {20, 10, 20, 4, 100};
		System.out.println(largestElement(arr));
	}
	
	//method 1 = O(nlogn) time and O(1) space sort and then return last value
	
	//O(n)time and O(1) space - method2
	public static int largestElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
			
		}
		return max;
	}
	

}
