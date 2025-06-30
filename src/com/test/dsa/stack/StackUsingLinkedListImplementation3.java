package com.test.dsa.stack;

public class StackUsingLinkedListImplementation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLLStack stack=new MyLLStack();
		stack.push(5);
		stack.push(10);
		stack.push(20);
		System.out.println(stack.peak());
		stack.pop();
		System.out.println(stack.peak());
	}
}

class MyLLStack{
	Node head;
	int size;
	MyLLStack(){
		head=null;
		size=0;
	}
	int size() { return size; }
	boolean isEmpty() {
		return (head==null);
	}
	//adding values at the head
	void push(int x) {
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
		size++;
	}
	int pop() {
		if(head==null) return Integer.MIN_VALUE;
		int res=head.data;
		head=head.next;
		size--;
		return res;
	}
	int peak() {
		if(head==null) return Integer.MIN_VALUE;
		return head.data;
	}	
}

class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
	}
	
}