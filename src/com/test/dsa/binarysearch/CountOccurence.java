package com.test.dsa.binarysearch;

/* Given a array (sorted order), find the number of times x is occurring
 * Return -1 if not found
 * I/P arr= [1,5,5,5,36,88,88,90] 
 * 		x= 5   O/P :3
 *      x=88    O/P : 2
 *      x=23  O/P: -1
 * 
 * */

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,5,5,36,88,88,90};
		System.out.println("Recursive approach");
		System.out.println(countOccurrence_Method1(arr,5));
		System.out.println(countOccurrence_Method1(arr,88));
		System.out.println(countOccurrence_Method1(arr,23));


	}

	public static int  countOccurrence_Method1(int arr[],int x) {
		int firstOccurence=FirstOccurrence.firOccurrenceRecursive(arr, 0, arr.length-1, x);
		int lastOccurence=LastOccurence.lastOccurenceRecursive(arr, 0, arr.length, x);
		if(firstOccurence== -1 || lastOccurence==-1) return -1;
		else return lastOccurence-firstOccurence+1;
		
	}
}
