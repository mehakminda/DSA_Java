package com.test.dsa.array;

/* Given a sorted array , find the frequencies of each array element.
 * I/P a={1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10} 
 * O/P : Frequency of 1 is: 3
         Frequency of 2 is: 1
         Frequency of 3 is: 2
         Frequency of 5 is: 2
         Frequency of 8 is: 3
         Frequency of 9 is: 2
         Frequency of 10 is: 1
 * I/P arr[] = {2, 2, 6, 6, 7, 7, 7, 11} 
 * O/P: Frequency of 2 is: 2
        Frequency of 6 is: 2
        Frequency of 7 is: 3
        Frequency of 11 is: 1
 * */

public class FrequenciesInSortedArray11 {

	public static void main(String[] args) {
		int a[]={1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};  
		int d=2;
		System.out.println("original array");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		
		System.out.println("Frequencies of each element in an Array _ Method1");
		frequenciesOfEachElement(a);

	}
	
	//O(n) time and O(1) space
	public static void frequenciesOfEachElement(int arr[]) {
		int freq=1; int i=1;
		int n=arr.length;
		while(i<n) {
			while(i<n && arr[i-1]==arr[i]) {
				freq++;i++;
			}
			System.out.println("Frequency of "+ arr[i-1]+ " is : "+freq);
			freq=1;
			i++;
			
		}
		if(n==1 ||arr[n-1]==arr[n-2]) {
			System.out.println("Frequency of "+ arr[n-1]+ " is : "+1);
		}
	}
	
	//what if the array is not sorted?
}

