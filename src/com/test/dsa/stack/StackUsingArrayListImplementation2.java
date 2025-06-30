package com.test.dsa.stack;

import java.util.ArrayList;

public class StackUsingArrayListImplementation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayListStack s=new MyArrayListStack();
		s.push(10);
		s.push(5);
		System.out.println(s.peak());
		s.pop();
		s.push(30);
		

	}

}
class MyArrayListStack{
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	void push(int x) {
		al.add(x);	
	}
	
	int pop() {
		if(al.size()==0) {
			return -1;	
		}
		int res=al.get(al.size()-1);
		al.remove(al.size()-1);
		return res;
	}
	
	int peak() {
		return al.get(al.size()-1);
	}
	
	boolean isEmpty() {
		return al.isEmpty();
	}
	
	int size() {
		return al.size();
	}
}
