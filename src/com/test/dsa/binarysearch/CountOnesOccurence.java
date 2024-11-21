package com.test.dsa.binarysearch;

/* Given a binary array (sorted order), find the number of times 1 is occurring
 * Return -1 if not found
 * I/P arr= [0,0,0,0,0,1,1,1,1,1] 
 * 	O/P: 5 
 * 
 * Count the last occurrence of 0 or 1st occurrence of 1 and subtract from total array length;
 * 
 * */

public class CountOnesOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,0,0,0,1,1,1,1,1};
		System.out.println(countOnes_Method1(arr));

		
		int arr1[]= {0,0,0,0,0,0,0,0};
		System.out.println(countOnes_Method1(arr1));
		
		int arr2[]= {1,1,1,1,1,1};
		System.out.println(countOnes_Method1(arr2));
	}
	
	//find first occurrence of 1;
	public static int countOnes_Method1(int [] arr) {
		int low=0;int high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==1) {
				if(mid==0 || arr[mid-1]!=arr[mid])
					return arr.length-mid;
				else 
					high=mid-1;
				
			}
			else if(arr[mid]==0) low=mid+1;
		}
		return -1;
	}


}
