package com.test.dsa.array;

/* Given an array , move the zeros to end
 * I/P a={1, 2, 0, 0, 0, 3, 6}
 * O/P :  1 2 3 6 0 0 0
 * I/P arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}
 * O/P: 1 9 8 4 2 7 6 9 0 0 0 0 0
 * */

public class MoveZeroToEndInArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2, 0, 0, 0, 3, 6};  
		moveZeroToEnd_Method1(a);// **** we pass in the reference of array a ****
		System.out.println("After Moving zero to end _ Method1");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();



		int a1[]={0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};  
		moveZeroToEnd_Method2(a1);// **** we pass in the reference of array a ****
		System.out.println("After Moving zero to end _Method 2");
		for(int i = 0; i < a1.length; i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();

	}

	/**
	 * In this approach, we traverse the array and, as soon as we find a 0 element, 
	 * we traverse to the right of the 0, and swap it with the 1st non-0 element found.
	 * 
	 */
	//O(n*n) time and O(1) space
	public static void moveZeroToEnd_Method1(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						arr[i]=arr[j];
						arr[j]=0;
					}
				}
			}
		}
	}

	/**
	 * In this approach, we maintain a count of the non-0 elements traversed. 
	 * When a 0 element is found, we place the value of the non-0 element at the element place of arr[count]
	 */
	//O(n) time and O(1) space
	public static void moveZeroToEnd_Method2(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;		
			}

		}
	}

}
