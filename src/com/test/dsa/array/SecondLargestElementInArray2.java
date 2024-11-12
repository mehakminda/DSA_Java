package com.test.dsa.array;

import java.util.Arrays;

/* Given an array , find the largest element in array (this array can contain duplicates)
 * I/P a={12, 35, 1, 10, 34, 1}
 * O/P :34
 * I/P a[] = {10, 5, 10}
 * O/P: 10
 * I/P a[]= {10, 10, 10}
 * O/P: doesnt exists
 * */
public class SecondLargestElementInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]={12, 35, 1, 10, 34, 1};
		int a2[]={10, 5, 10};
		int a3[]={10, 10, 10};
		SecondLargestElement_Method1(a1);
		SecondLargestElement_Method1(a2);
		SecondLargestElement_Method1(a3);
		
		SecondLargestElement_Method2(a1);
		SecondLargestElement_Method2(a2);
		SecondLargestElement_Method2(a3);

	}
	
	//Naive : O(nlogn) time and O(1) space
	public static void SecondLargestElement_Method1(int arr[]){
		//check the length of array
		if(arr.length<2) {
			 System.out.printf(" Invalid Input ");
			    return;
		}
		
		Arrays.sort(arr);
		
	    // Start from second last element, as the largest element is at last
		for(int i=arr.length-2;i>=0;i--) {
			//If the element is not equal to largest element
			if(arr[i]!=arr[arr.length-1]) {
				System.out.printf("The second largest element is %d\n", arr[i]);
				return;
			}	
		}
		System.out.printf("There is no second largest element\n");
		
	}
	
	//Efficient : O(n) time and O(1) space
	public static void SecondLargestElement_Method2(int arr[]){
		if(arr.length<2) {
			System.out.printf(" Invalid Input ");
		    return;
		}
		int largest = Integer.MIN_VALUE; 
		int second_largest=Integer.MIN_VALUE;
		
		//Find largest element
		for(int i=0;i<arr.length;i++) {
			//if(largest<arr[i]) largest=arr[i];
			largest = Math.max(largest, arr[i]);
		}
		
		//find second largest element
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest) {
				//if(arr[i]>second_largest) second_largest=arr[i];
				second_largest = Math.max(second_largest, arr[i]);
			}
		}
		if(second_largest==Integer.MIN_VALUE) {
			System.out.printf("There is no second largest element\n");
		}
		else {
			System.out.printf("The second largest element is %d\n", second_largest);
		}
			
	}

}
