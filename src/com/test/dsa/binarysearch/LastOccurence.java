package com.test.dsa.binarysearch;

/* Given a array (sorted order), find the index of number x occurrencing first time
 * Return -1 if not found
 * I/P arr= [1,5,5,5,36,88,88,90] 
 * 		x= 5   O/P :1
 *      x=88    O/P : 5
 *      x=23  O/P: -1
 * 
 * */

public class LastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,5,5,36,88,88,90};
		System.out.println("Iteative approach");
		System.out.println(lastOccurenceIterative(arr,5));
		System.out.println(lastOccurenceIterative(arr,88));
		System.out.println(lastOccurenceIterative(arr,23));
		System.out.println("Recursive approach");
		System.out.println(lastOccurenceRecursive(arr,0,arr.length,5));
		System.out.println(lastOccurenceRecursive(arr,0,arr.length,88));
		System.out.println(lastOccurenceRecursive(arr,0,arr.length,23));

	}
	
	public static int lastOccurenceIterative(int arr[],int x) {
		int low=0;int high=arr.length;
		int mid=(low+high)/2;
		while(low<=high) {
			if(arr[mid]==x) {
				if(mid==arr.length || arr[mid+1]!=arr[mid]) return mid;
				else  low=mid+1;
			}
			else if(arr[mid]>x)  high=mid-1;
			else  low=mid+1;
		}
		return -1;
		
		
	}
	public static int lastOccurenceRecursive(int arr[],int low,int high,int x) {
		if(low>high) return -1;
		int mid=(low+high)/2;
		if(arr[mid]==x) {
			if(mid==arr.length || arr[mid+1]!=arr[mid]) return mid;
			else return lastOccurenceRecursive(arr,mid+1,high,x);
		}
		else if(arr[mid]>x) return lastOccurenceRecursive(arr,low,mid-1,x);
		else return lastOccurenceRecursive(arr,mid+1,high,x);
		
	}
	

}
