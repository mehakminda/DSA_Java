package com.test.dsa.recursion;

/* Print all Subsets of a String 
 * I/P s= "ABC"
 * O/P "" "A" "B" "C" "AB" "AC" "BC" "ABC"
 * 
 * */

public class GenerateSubsets6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		generatesubets(s,"",0);

	}
	public static void generatesubets(String s,String subset,int count) {
		if(count==s.length()) {System.out.println(subset);return;}
		generatesubets(s,subset,count+1);
		generatesubets(s,subset+s.charAt(count),count+1);
		
	}
	/**/

}
