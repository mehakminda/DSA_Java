package com.test.dsa.array.renaissance;

/**
 * Given an array where each element represents heights of 'N' pillars in a row. Find the total height of water trapped in rain.
 * 
 * 
 * arr=[0,1,0,2,1,3,0,2]
 * 
 * 
 * Solution:
 * 1. Water will get trapped only if there is a pillar of more height than the current pillar on both left and right side., else no water
 * is trapped.
 * 2. The amount of water trapped on each pillar, will be min(pillar of max height of left and pillar of max height on right)
 * 3. Wster never gets accumulated on first and last pillar.
 * 
 * 
 * Take 2 array , store prefix max in one and suffix max in another
 */
public class Histogram02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,2,1,3,0,2};
		
		int prefix_max[]=PreCompuatationTechniques01.prefixMax(arr);
		int suffix_max[]=PreCompuatationTechniques01.suffixMax(arr);
		
		for(int i=1;i<arr.length-1;i++) {
			
		}
				

	}

}
