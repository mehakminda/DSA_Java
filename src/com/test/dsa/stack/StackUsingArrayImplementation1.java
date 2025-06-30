package com.test.dsa.stack;

public class StackUsingArrayImplementation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayStack s=new MyArrayStack(5);
		s.push(10);
		s.push(5);
		System.out.println(s.peak());
		s.pop();
		s.push(30);
		
	}

}

//Array is Fixed size.
class MyArrayStack{
	int arr[];
	int capacity;
	int top;
	MyArrayStack(int capacity){
		top=-1;
		this.capacity=capacity;
		arr=new int[capacity];
		
	}
	int pop() {
		if(top==-1) {return -1;}
		int res= arr[top];
		top--;
		return res;
		
	}
	void push(int x) {
		if(top==capacity) {return; }
		top++;
		 arr[top]=x;
	}
	int peak() {
		if(top==-1) {return -1;}
		int res=arr[top];
		return res;
	}
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return (top==-1);
	}
}
