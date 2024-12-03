package com.test.dsa.linkedlist;

public class InsertionLL3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Create a linked list by inserting elements at the beginning");
		NodeSLL head=null;
		head=InsertBegin(head, 20);
		head=InsertBegin(head, 30);
		head=InsertBegin(head, 10);

		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		ImplementationLL1.traversal_SLL_Recursive(head);
		System.out.println();
		
		
		System.out.println("Create a linked list by inserting elements at the ends");
		head=null;
		head=InsertEnd(head, 10);
		head=InsertEnd(head, 30);
		head=InsertEnd(head, 20);
		
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		ImplementationLL1.traversal_SLL_Recursive(head);
		System.out.println();
		
		System.out.println("Create a linked list by inserting elements at the a 1st positon");
		head=InsertPosition(head, 15,1);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Create a linked list by inserting elements at the a 5th positon");
		head=InsertPosition(head, 45,5);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		System.out.println("Create a linked list by inserting elements at the a 8th positon");
		head=InsertPosition(head, 25,8);
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		
		

	}
	
	//O(1) time and O(1) space
	public static NodeSLL InsertBegin(NodeSLL head, int data) {
		NodeSLL temp=new NodeSLL(data);
		temp.next=head;
		head=temp;
		return head;
	}
	
	//O(n) time and O(1) space
	public static NodeSLL InsertEnd(NodeSLL head, int data) {
		NodeSLL temp=new NodeSLL(data);
		NodeSLL curr=head;
		if(curr==null) {
			return temp;
		}
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;
		return head;
		
	}
	
	//O(n) time and O(1) space
	public static NodeSLL InsertPosition(NodeSLL head, int data, int position) {
		NodeSLL temp=new NodeSLL(data);
		if(position==1) {
			temp.next=head;
			return temp;
		}
		NodeSLL curr=head;
		for(int i=1;i<=position-2 && curr!=null ;i++) {
			curr=curr.next;
		}
		if(curr==null) return head;
		temp.next=curr.next;
		curr.next=temp;
		return head;
		
	}
}


