package com.test.dsa.recursion;


/* Given a string , check if it is pallindrome or not using recursion
 * I/P s="abbcbba"
 * O/P : yes
 * I/P s="abba"
 * O/P : yes
 * I/P s="geeks"
 * O/P : No
 * */
public class CheckPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbcbba";
		System.out.println("Is 'abbcbba' a pallindrome: "+ isPallindrome(s,0,s.length()-1));
		s="abba";
		System.out.println("Is 'abba' a pallindrome: "+ isPallindrome(s,0,s.length()-1));
		s="geeks";
		System.out.println("Is 'geeks' a pallindrome: "+ isPallindrome(s,0,s.length()-1));

	}
	public static boolean  isPallindrome(String s, int start, int end) {
		if(start>=end) return true;
		return (s.charAt(start)==s.charAt(end)) && isPallindrome(s,start+1,end-1);
	}

}
