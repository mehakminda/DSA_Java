package com.test.dsa.array;

/* Given an array , check if the array is sorted or not in (asc/desc)
 * I/P a={1, 2, 3} 
 * O/P :{3, 2, 1}
 * I/P a={4, 5, 1, 2}
 * O/P :{2, 1, 5, 4}
 * */

public class ReverseArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4, 5, 1, 2};
		System.out.println("Before Reverse");
		for(int i = 0; i < a.length; i++)
	    {
			System.out.print(a[i]+" ");
	    }
		System.out.println();
	       
	       
		reverseArray(a);// **** we pass in the reference of array a ****
		
		System.out.println("After Reverse");
		for(int i = 0; i < a.length; i++)
	    {
			System.out.print(a[i]+" ");
	    }
		System.out.println();
		
		
	}
	
	//O(n) time and O(1) space
	public static void reverseArray(int arr[]) {
		int left=0;int right=arr.length-1; 
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;right--;
		}
		
	}

}
