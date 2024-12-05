package com.test.dsa.linkedlist;

public class DeletionInDLL7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		NodeDLL head= new NodeDLL(10);
		NodeDLL temp1=new NodeDLL(30);
		NodeDLL temp2=new NodeDLL(20);

		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;

		

		System.out.println("Create a linked list");
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();

		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);;
		System.out.println();
		System.out.println("Deleted the first Node in  a linked list");
		head=deleteFirst(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();

		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("");

		head=new NodeDLL(10);
		temp1=new NodeDLL(30);
		temp2=new NodeDLL(20);
		head.next=temp1;
		temp1.next=temp2; //head.next.next=temp2;

		System.out.println("Create a linked list");
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Deleted the last Node in  a linked list");
		head=deleteLast(head);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();

	}

	//O(1) time and O(1) space
	public static NodeDLL deleteFirst(NodeSLL head) {
		if(head==null) return null;
		return head.next;
		
	}
	
	//O(n) time and O(1) space
	public static NodeDLL deleteLast(NodeSLL head) {
		NodeDLL curr=head;
		if(head==null ) return null;
		if(head.next==null) return null;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		return head;
		
	}
	
	//O(n) time and O(1) space
	public static NodeDLL deletePosition(NodeSLL head) {
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
