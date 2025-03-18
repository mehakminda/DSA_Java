package com.test.dsa.array;



/**
 * Programming patshala
 * 
 * arr[]: {1,2,0,4,3,5}
 * Find the maximum chunks that it should be divided into so as to get sorted array
 * Op: 3
 *  
 */
public class MaximumChunks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= {1,2,0,4,3,5};
		int arr[]= {1,0,2,3,4};
		int i=0;
		int maxchunk=0;
		while (i< arr.length) {
			for(int j=i;j<arr.length;j++) {
				if(canbeChunked(i,j,arr)) maxchunk++;
			}
			i++;
		}
		System.out.println("max chunks is "+maxchunk);

	}
	public static boolean canbeChunked(int i, int j, int arr[] ){
		if(arr[j]==i) return true;
		else return false;
	}

}
