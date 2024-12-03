package com.test.dsa.linkedlist;

public class DeletionInLL4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL head=new NodeSLL(10);
		NodeSLL temp1=new NodeSLL(30);
		NodeSLL temp2=new NodeSLL(20);
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
		
		head=new NodeSLL(10);
		 temp1=new NodeSLL(30);
		 temp2=new NodeSLL(20);
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
	
	//O(1) time and O(1) space
	public static NodeSLL deleteFirst(NodeSLL head) {
		if(head==null) return null;
		return head.next;
		
	}
	
	//O(n) time and O(1) space
	public static NodeSLL deleteLast(NodeSLL head) {
		NodeSLL curr=head;
		if(head==null ) return null;
		if(head.next==null) return null;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		return head;
		
	}
	
	//O(n) time and O(1) space
	public static NodeSLL deletePosition(NodeSLL head) {
		NodeSLL curr=head;
		if(head==null ) return null;
		if(head.next==null) return null;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		return head;
		
	}
	

}
