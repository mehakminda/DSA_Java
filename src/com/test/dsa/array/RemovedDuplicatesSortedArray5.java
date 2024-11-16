package com.test.dsa.array;

/* Given a sorted array , remove the duplicate elements
 * I/P a={2, 2, 2, 2, 2}
 * O/P : {2}
 * I/P arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
 * O/P: {1, 2, 3, 4, 5}
 * */

public class RemovedDuplicatesSortedArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2, 2, 2, 2, 3};  
		removeDuplicates_Method1(a);// **** we pass in the reference of array a ****
		System.out.println("After Removing Duplicates Method1");
		for(int i = 0; i < a.length; i++)
	    {
			System.out.print(a[i]+" ");
	    }
		System.out.println();
		

		
		int a1[]={2, 2, 2, 4, 5};  
		removeDuplicates_Method2(a1);// **** we pass in the reference of array a ****
		System.out.println("After Removing Duplicates Method 2");
		for(int i = 0; i < a1.length; i++)
	    {
			System.out.print(a1[i]+" ");
	    }
		System.out.println();

	}
	
	//O(n) time and O(n) space
	public static void removeDuplicates_Method1(int arr[]) {
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		int res=1;
		for(int i=0;i<arr.length;i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res]=arr[i];
				res++;
			}
		}
		//copying contents back to arr
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp[i];
		}
	}
	
	//O(n) time and O(1) space
	public static void removeDuplicates_Method2(int arr[]) {
		int res=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[res-1]!=arr[i]) {
				arr[res]=arr[i];
				res++;
			}
			
		}
		//make rest of element as 0
		for(int i=res;i<arr.length;i++) {
			arr[i]=0;
		}
			
	}

}
