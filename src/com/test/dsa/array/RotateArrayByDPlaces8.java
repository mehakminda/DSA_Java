package com.test.dsa.array;


/* Given an array , rotate the array by d position(both left)
 * I/P a={1, 2, 3, 4, 5, 6, 7}, d = 2
 * O/P :  3 4 5 6 7 1 2
 * I/P arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
 * O/P: 5 6 7 1 2 3 4
 * */


public class RotateArrayByDPlaces8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2, 3, 4, 5, 6, 7};  
		int d=2;
		System.out.println("Array before rotations");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		leftRotateByN_Method1(a,d);
		System.out.println("Left Rotate an array by d place");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		int a1[]={1, 2, 3, 4, 5, 6, 7};  
		leftRotateByN_Method2(a1,d);
		System.out.println("Left Rotate an array by d place");
		for(int i = 0; i < a1.length; i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();

		int a2[]={1, 2, 3, 4, 5, 6, 7};  
		leftRotateByN_Method3(a2,d);
		System.out.println("Left Rotate an array by d place");
		for(int i = 0; i < a2.length; i++)
		{
			System.out.print(a2[i]+" ");
		}
		System.out.println();


	}


	// Naive Approach :In this approach, we rotate the array by one position for D times.
	//O(n*d) time and O(1) space
	public static void leftRotateByN_Method1(int arr[],int d) {
		for(int j=1;j<=d;j++) {
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
	}

	/*
	 * Better Approach: In this approach, we store the first D elements of the array in a new array, 
	 * and shift the remaining elements by D positions to the left.
	 *  Finally we copy back the D elements from the new array to the end of the original array.
	 */
	//O(n) time and O(d) space
	public static void leftRotateByN_Method2(int arr[], int d) {
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=0;i<arr.length-d;i++) {
			arr[i]=arr[i+d];
		}
		for(int i=0;i<d;i++) {
			arr[arr.length-d+i]=temp[i];
		}
	}

	/*
	 * Reversal Approach (Efficient): This approach consists of 3 reversal steps:
	 * Reverse the elements from 0 to d-1 index
	 * Reverse the elements from d to n-1 index
	 * finally reverse the whole array
	 */
	//O(n) time and O(1) space
	public static void leftRotateByN_Method3(int arr[], int d) {
		int n=arr.length;
		reverse (arr,0,d-1);
		reverse(arr,n-d,n-1);
		reverse(arr,0,n-1);
		
	}
	public static void reverse(int arr[], int left, int right) { 
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;right--;
		}
		
	}

}
