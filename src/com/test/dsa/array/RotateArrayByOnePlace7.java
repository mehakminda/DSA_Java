package com.test.dsa.array;

/* Given an array , move the zeros to end
 * I/P a={1,2,3,4,5}
 * O/P :   {2,3,4,5,1}
 * I/P arr[] = {30,5,20}
 * O/P: {5,20,30}
 * */

public class RotateArrayByOnePlace7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};  
		System.out.println("Array before rotations");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		leftRotateBy1(a);// **** we pass in the reference of array a ****
		System.out.println("Left Rotate an array by 1 place");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		int a1[]={1,2,3,4,5};  
		rightRotateBy1(a1);// **** we pass in the reference of array a ****
		System.out.println("Right Rotate an array by 1 place");
		for(int i = 0; i < a1.length; i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}


	//O(n) time and O(1) space
	public static void leftRotateBy1(int arr[]) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}

	//O(n) time and O(1) space
	public static void rightRotateBy1(int arr[]) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		
		}
		arr[0]=temp;
	}
}
