package com.test.dsa.binarysearch;


/* Given a array (sorted order), find the index of number x occurrencing first time
 * Return -1 if not found
 * I/P arr= [1,5,5,5,36,88,88,90] 
 * 		x= 5   O/P :1
 *      x=88    O/P : 5
 *      x=23  O/P: -1
 * 
 * */

public class FirstOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,5,5,5,36,88,88,90};
		System.out.println("Iteative approach");
		System.out.println(firOccurrenceIterative(arr,5));
		System.out.println(firOccurrenceIterative(arr,88));
		System.out.println(firOccurrenceIterative(arr,23));
		System.out.println("Recursive approach");
		System.out.println(firOccurrenceRecursive(arr,0,arr.length-1,5));
		System.out.println(firOccurrenceRecursive(arr,0,arr.length-1,88));
		System.out.println(firOccurrenceRecursive(arr,0,arr.length-1,23));

	}
	public static int firOccurrenceRecursive(int [] arr, int low, int high, int x) {
		if(low>high) return -1;
		int mid=(low+high)/2;
		if(arr[mid]==x) {
			if(mid==0||arr[mid-1]!=arr[mid]) return mid;
			else return firOccurrenceRecursive(arr, low,mid-1,x);
		}
		else if(arr[mid]>x) return firOccurrenceRecursive(arr, low,mid-1,x);
		else return firOccurrenceRecursive(arr, mid+1,high,x);


	}

	public static int firOccurrenceIterative(int [] arr, int x) {
		int n=arr.length;
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				{
					if(mid==0||arr[mid-1]!=arr[mid]) return mid;
					else high=mid-1;
				}
			}
			else if(arr[mid]>x) high=mid-1;
			else  low=mid+1;
		}
		return -1;
	}
}
