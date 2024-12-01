package com.test.dsa.linkedlist;

public class ImplementationLL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(10);
		Node temp1=new Node(30);
		Node temp2=new Node(20);
		head.next=temp1;
		temp1.next=temp2; //head.next.next=temp2;
		traversal_SLL_Iterative(head);
		System.out.println();
		traversal_SLL_Recursive(head);
	}
	
	////O(n) time and O(1) space
	public static void traversal_SLL_Iterative(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	////O(n) time and O(n) space
	public static void traversal_SLL_Recursive(Node head) {
		if(head==null) return ;
		else {
			System.out.print(head.data+" ");
			traversal_SLL_Recursive(head.next);
			
		}
	}
}

 class  Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}

