package com.test.dsa.binarysearch;

/* Given a array(sorted order), determine whether there exists a pair of integers in the array that adds up to a given target value.
 * 
 * I/P arr= {2,5,8,12,30} x=17
 * 	 O/P : True
 *      
 * I/P arr= {3,8,13,18} x=14
 * 	 O/P : false
 * 
 * */

public class IsTriplet_TwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,8,9,20,40};
		int x=32;
		System.out.println("Is a triplet possible(Method1) : "+isTriplet_Method1(arr, x));
		System.out.println("Is a triplet possible(Method2) : "+isTriplet_Method2(arr, x));
		System.out.println("Is a triplet possible(Method3) : "+isTriplet_Method3(arr, x));

		
		System.out.println();
		int arr2[]= {1,2,5,6};
		int x2=14;
		System.out.println("Is a triplet possible(Method1) : "+isTriplet_Method1(arr2, x2));
		System.out.println("Is a triplet possible(Method2) : "+isTriplet_Method2(arr2, x2));


	}
	//O(n*n*n) time and O(1) space
	public static boolean isTriplet_Method1(int arr[],int x) {
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						System.out.println("The triplet are: ("+ arr[i]+","+arr[j]+","+arr[k]+") for sum "+x);
						return true;
					}
				}
			}
		}
		return false;

	}

	//O(n*n) time and O(1) space
	public static boolean isTriplet_Method2(int arr[],int x) {
		for( int i=0;i<arr.length-2;i++) {
			int j=i+1;;
			int k=arr.length-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>x) k--;
				if(arr[i]+arr[j]+arr[k]<x) j++;
				else {
					System.out.println("The triplet is: ("+ arr[i]+","+arr[j]+","+arr[k]+") for sum "+x);
					return true;
				}
			}
		}
		return false;
	}


	//O(n*n) time and O(1) space (variation of method2)
	public static boolean isTriplet_Method3(int arr[],int x) {
		int j=1;
		int k=arr.length-1;
		for( int i=0;i<arr.length-2;i++) {
			if(IsPair_TwoPointerApproach.isPair_Method2(arr, x-arr[i]));
			}
		}
		return false;
	}

}
