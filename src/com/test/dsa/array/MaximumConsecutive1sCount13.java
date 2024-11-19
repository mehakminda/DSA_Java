package com.test.dsa.array;


/* Given a binary array, find the count of the maximum number of consecutive 1's present in the array.
 * I/P a={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
 * O/P :  4
 * I/P arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
 * O/P: 1
 * */

public class MaximumConsecutive1sCount13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int a[]={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};  
		MaxConsecutive1_Method1(a);// **** we pass in the reference of array a ****
		System.out.println("After Moving zero to end _ Method1");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();



		int a1[]={0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};  
		MaxConsecutive1_Method1(a1);// **** we pass in the reference of array a ****
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
	public static void MaxConsecutive1_Method1(int arr[]) {
		int maxOnes=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0) {
				maxOnes++;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						
					}
					else {
						
					}
				}
			}
			
		}
		System.out.println(maxOnes);
	}

	/**
	 * In this approach, we maintain a count of the non-0 elements traversed. 
	 * When a 0 element is found, we place the value of the non-0 element at the element place of arr[count]
	 */
	//O(n) time and O(1) space
	public static void MaxConsecutive1_Method2(int arr[]) {
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
