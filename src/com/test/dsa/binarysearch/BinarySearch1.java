package com.test.dsa.binarysearch;

/* Given a array(sorted order), find the index of number x 
 * Return -1 if not found
 * I/P arr= [1,5,8,13,36,56,88,90] 
 * 		x= 88   O/P :6
 *      x=1    O/P : 0
 *      x=23  O/P: -1
 * 
 * */

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,8,13,36,56,88,90};
		System.out.println("Iteative approach");
		System.out.println(binarysearchIterative(arr,88));
		System.out.println(binarysearchIterative(arr,1));
		System.out.println(binarysearchIterative(arr,23));
		System.out.println("Recursive approach");
		System.out.println(binarysearchRecursive(arr,88,0,arr.length));
		System.out.println(binarysearchRecursive(arr,1,0,arr.length));
		System.out.println(binarysearchRecursive(arr,23,0,arr.length));

	}
	public static int binarysearchIterative(int arr[], int x) {
		int n=arr.length;
		int low=0; int high=n-1;
		
		for(int i=0;i<n;i++) {
			int mid=(low+high)/2;
			if(arr[mid]==x) return mid;
			else if(arr[mid]>x) high=mid-1;
			else low=mid+1;
		}
		return -1;
	}
	
	public static int binarysearchRecursive(int arr[], int x, int low, int high) {
		int mid=(low+high)/2;
		if(low>mid) return -1;
		if(arr[mid]==x) return mid;
		else if(arr[mid]>x)return binarysearchRecursive(arr,x,low,mid-1);
		else return binarysearchRecursive(arr,x,mid+1,high);
	}

}
