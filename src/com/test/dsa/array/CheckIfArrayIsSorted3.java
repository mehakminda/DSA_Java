package com.test.dsa.array;

/* Given an array , check if the array is sorted or not in (asc/desc)
 * I/P a={8, 12, 15} 
 * O/P :yes
 * I/P a={8, 10, 10, 12}  
 * O/P :yes
 * I/P a= {10, 10} 
 * O/P :yes
 * I/P a={100} 
 * O/P :yes
 * I/P a= {100, 20 ,200}  
 * O/P :No
 * I/P a={200, 100}  
 * O/P :yes
 * */

public class CheckIfArrayIsSorted3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8, 12, 15} ;
		System.out.println("is sorted: "+ isArraySorted_Method1(a));
		System.out.println("is sorted: "+ isArraySorted_Method2(a));
		int a1[]= {8, 12,12, 15} ;
		System.out.println("is sorted: "+ isArraySorted_Method1(a1));
		System.out.println("is sorted: "+ isArraySorted_Method2(a1));
		int a2[]= {8} ;
		System.out.println("is sorted: "+ isArraySorted_Method1(a2));
		System.out.println("is sorted: "+ isArraySorted_Method2(a2));
		
	}
	
	//Naive - O(n*n) time and O(1) space
	public static boolean isArraySorted_Method1(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) return false;
			}
		}
		return true;
	}
	
	//Naive - O(n) time and O(1) space
		public static boolean isArraySorted_Method2(int arr[]) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) return false;
			}
			return true;
		}
}
