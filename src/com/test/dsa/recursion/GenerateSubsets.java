package com.test.dsa.recursion;

/* Print all Subsets of a String 
 * I/P s= "ABC"
 * O/P "" "A" "B" "C" "AB" "AC" "BC" "ABC"
 * 
 * */

public class GenerateSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		generatesubets(s,"",0);

	}
	public static void generatesubets(String s,String curr, int i ) {
		
		if(i==s.length()) {
			System.out.print(curr+" ");
			return;
		}
		generatesubets(s,curr,i+1);
		generatesubets(s,curr+s.charAt(i),i+1);
		
	}

}
