package com.test.dsa.array;

/* Given an array , find all leaders in an array
 * Leader: An element is a leader if it is greater than all the elements to its right side. And the 
 * rightmost element is always a leader. 
 * 
 * I/P a={16, 17, 4, 3, 5, 2}
 * O/P :   17, 5, 2
 * I/P arr[] =  {1, 2, 3, 4, 5, 2}
 * O/P:  5, 2
 * */


public class LeadersInArray9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={16, 17, 4, 3, 5, 2};  
		int d=2;
		System.out.println("original array");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		
		System.out.println("Leader in an Array _ Method1");
		Leader_Method1(a);

		int a1[]={16, 17, 4, 3, 5, 2};  
		
		System.out.println("Leader in an Array _ Method2");
		Leader_Method2(a1);

	}

	
	/*
	 * Naive Approach : We use two loops in this approach. The outer loop runs from 0 to size – 1 and 
	 * one by one picks all elements from left to right. The inner loop compares the picked element 
	 * to all the elements on its right side. If the picked element is greater than all the elements 
	 * to its right side, then the picked element is the leader. 
	 */
	//O(n*n) time and O(1) space
	public static void Leader_Method1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean isLeader=true;
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]>arr[i]) isLeader=false;
				
			}
			if(isLeader) {
				System.out.print( arr[i]+ " ");
				isLeader=true;
			}
		}
		
		System.out.println();
	}

	/*
	 * Efficient Approach: The idea is to scan all the elements from right to left in an array and 
	 * keep track of the maximum till now. When the maximum changes its value, print it.
	 */
	//O(n) time and O(1) space
	public static void Leader_Method2(int arr[]) {
		int n=arr.length;
		int curr_leader=arr[n-1];
		System.out.print( curr_leader+ " ");
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>curr_leader) {
				curr_leader=arr[i];
				System.out.print( curr_leader+ " ");
			}
		}
		System.out.println();
		
	}

}
