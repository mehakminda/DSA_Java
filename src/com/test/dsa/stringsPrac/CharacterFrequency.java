package com.test.dsa.stringsPrac;


/* Given a string , find the frequency of all character
 * I/P s="geeksforgeeks"
 * O/P :
 * e-4
 * f:1
 * g:2
 * .....
 * */

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="geeksforgeeks";
		
		int count[]= new int[26];
		for( int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		for( int i=0;i<26;i++) {
			 
			if (count[i]>0) System.out.println((char)(i+'a')+" : "+ count[i]);
		}

	}

}
