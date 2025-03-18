package com.test.dsa.array;

/**
 * Programming patshala
 * Given an array, find the max water that can be trapped
 * arr[]: [0,1,0,2,1,3,0,2]
 * O/P: 4
 */
public class HistorgramProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,2,1,3,0,2};
		int[] pMax=prefix_Max(arr,arr.length);
		int[] sMax=suffix_Max(arr,arr.length);
		
		System.out.println("Printing array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Printing prefix max array");
		for(int i=0;i<pMax.length;i++) {
			System.out.print(pMax[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Printing suffix max array");
		for(int i=0;i<sMax.length;i++) {
			System.out.print(sMax[i]+" ");
		}
		System.out.println();
		
		
		int sumOfwaterLogged=0;
		for(int i=1;i<arr.length-1;i++) {
			int min=Math.min(pMax[i-1], sMax[i+1]);
			if(min<=arr[i]) {
				continue;
			}
			else {
				sumOfwaterLogged=sumOfwaterLogged+min-arr[i];
			}
				
		}
		System.out.println("Total water logged is: "+ sumOfwaterLogged);
		

	}
	public static int[] prefix_Max(int arr[], int n ) {
		int[] pmax=new int[n];
		pmax[0]=arr[0];
		for(int i=1;i<n;i++) {
			pmax[i]=Math.max(pmax[i-1], arr[i]);
		}
		return pmax;
	}
	
	
	public static int[] suffix_Max(int arr[], int n ) {
		int[] smax=new int[n];
		smax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			smax[i]=Math.max(smax[i+1], arr[i]);
		}
		return smax;
	}
	

}
