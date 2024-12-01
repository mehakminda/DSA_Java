package com.test.dsa.linkedlist;

public class DeletionInLL4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		Node temp1=new Node(30);
		Node temp2=new Node(20);
		head.next=temp1;
		temp1.next=temp2; //head.next.next=temp2;
		
		System.out.println("Create a linked list");
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("");
		
		head=new Node(10);
		 temp1=new Node(30);
		 temp2=new Node(20);
		head.next=temp1;
		temp1.next=temp2; //head.next.next=temp2;
		
		System.out.println("Create a linked list");
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();

	}
	
	
	public static Node deleteFirst(Node head) {
		if(head==null) return null;
		return head.next;
		
	}
	public static Node deleteLast(Node head) {
		Node curr=head;
		if(head==null ) return null;
		if(head.next==null) return null;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		return head;
		
	}
	
	

}
