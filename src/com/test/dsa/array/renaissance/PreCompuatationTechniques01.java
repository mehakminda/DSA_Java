package com.test.dsa.array.renaissance;

import java.util.ArrayList;

/**
 * IP: arr=[5,-1,2,4,10,2,7,1,8]
 * 
 * Given array find the sum of subarrays indexing between L and R
 * IP: L,R = (0,5) (1,3) (3,6)  -> 3 queries (Q)
 * 
 * Solution: Prefix-Sum
 * Time complexity: O(N+Q)
 * Space Complexity: O(1)/O(N)
 * 
 * Given an array find the max of array from 0 to till an index 'idx'.
 * 
 * Solution: Prefix-Max
 * Time complexity: O(N+Q)
 * Space Complexity: O(1)/O(N)
 * 
 * Similarly we have Prefix min, suffix Sum, Suffix max, Suffic min(right to left)
 * 
 */
public class PreCompuatationTechniques01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,-1,2,4,10,2,7,1,8};
		/*
		 * ArrayList <Integer> arr= new ArrayList<Integer>(); arr.add(5); arr.add(-1);
		 * arr.add(2); arr.add45); arr.add(10); arr.add(2); arr.add(7);arr.add(1);
		 * arr.add(8);
		 */
		
		
		System.out.print(" Original Array : ");
		for(Integer e: arr) {
			System.out.print(e+" ");	
		}
		
		int Prefix_Sum_Array[] =prefixSum(arr);
		System.out.println();
		System.out.print(" Prefix Sum : ");
		for(Integer e: Prefix_Sum_Array) {
			System.out.print(e+" ");	
		}

		int arr1[]= {5,-1,2,4,10,2,7,1,8};
		int Prefix_Min_Array[] =prefixMin(arr1);
		System.out.println();
		System.out.print(" Prefix Min : ");
		for(Integer e: Prefix_Min_Array) {
			System.out.print(e+" ");	
		}
		
		
		int arr2[]= {5,-1,2,4,10,2,7,1,8};
		int Prefix_Max_Array[] =prefixMax(arr2);
		System.out.println();
		System.out.print(" Prefix Max : ");
		for(Integer e: Prefix_Max_Array) {
			System.out.print(e+" ");	
		}
		
		int arr3[]= {5,-1,2,4,10,2,7,1,8};
		int Suffix_Sum_Array[] =suffixSum(arr3);
		System.out.println();
		System.out.print(" Suffix Sum : ");
		for(Integer e: Suffix_Sum_Array) {
			System.out.print(e+" ");	
		}
		
		int arr4[]= {5,-1,2,4,10,2,7,1,8};
		int Suffix_Min_Array[] =suffixMin(arr4);
		System.out.println();
		System.out.print(" Suffix Min : ");
		for(Integer e: Suffix_Min_Array) {
			System.out.print(e+" ");	
		}
		
		int arr5[]= {5,-1,2,4,10,2,7,1,8};
		int Suffix_Max_Array[] =suffixMax(arr5);
		System.out.println();
		System.out.print(" Suffix Max : ");
		for(Integer e: Suffix_Max_Array) {
			System.out.print(e+" ");	
		}
	}
	
	public static int[] prefixSum(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			arr[i]= (arr[i-1]+arr[i]);
		}
		return arr;
		
	}
	
	public static int[] prefixMin(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			arr[i]=Math.min(arr[i-1],arr[i]);
		}
		return arr;
	}
	
	public static int[] prefixMax(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			arr[i]=Math.max(arr[i-1],arr[i]);
		}
		return arr;

	}
	
	public static int[] suffixSum(int arr[]) {
		
		for(int i=arr.length-2;i>=0;i--) {
			arr[i]=arr[i+1]+arr[i];
		}
		return arr;
		
	}
	
	public static int[] suffixMin(int arr[]) {
		
		for(int i=arr.length-2;i>=0;i--) {
			arr[i]=Math.min(arr[i+1],arr[i]);
		}
		return arr;		
	}
	
	public static int[] suffixMax(int arr[]) {
		
		for(int i=arr.length-2;i>=0;i--) {
			arr[i]=Math.max(arr[i+1],arr[i]);
		}
		
		return arr;	
	}


}
