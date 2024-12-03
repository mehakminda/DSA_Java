package com.test.dsa.linkedlist;

public class InsertInDLL6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Create a double linked list by inserting elements at the beginning");
		NodeDLL head=null;
		head=InsertBegin(head, 20);
		head=InsertBegin(head, 30);
		head=InsertBegin(head, 10);

		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		ImplementationDLL5.traversal_DLL_Recursive(head);
		System.out.println();
		
		
		System.out.println("Create a double linked list by inserting elements at the ends");
		head=null;
		head=InsertEnd(head, 10);
		head=InsertEnd(head, 30);
		head=InsertEnd(head, 20);
		
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		ImplementationDLL5.traversal_DLL_Recursive(head);
		System.out.println();
		
		System.out.println("Create a double linked list by inserting elements at the a 1st positon");
		head=InsertPosition(head, 15,1);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Create a double linked list by inserting elements at the a 5th positon");
		head=InsertPosition(head, 45,5);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();
		System.out.println("Create a double linked list by inserting elements at the a 8th positon");
		head=InsertPosition(head, 25,8);
		ImplementationDLL5.traversal_DLL_Iterative(head);
		System.out.println();

	}

	//O(1) time and O(1) space
	public static NodeDLL InsertBegin(NodeDLL head, int data) {
		NodeDLL temp=new NodeDLL(data);
		if(head==null) return temp;
		temp.next=head;
		head.prev=temp;
		return temp;
		
	}
	
	//O(n) time and O(1) space
	public static NodeDLL InsertEnd(NodeDLL head, int data) {
		NodeDLL temp=new NodeDLL(data);
		NodeDLL curr=head;
		if(head==null)return temp;
		while(curr.next!=null) {
			curr=curr.next;
		}
		temp.prev=curr;
		curr.next=temp;
		return head;
		
		
	}
	
	//O(n) time and O(1) space
	public static NodeDLL InsertPosition(NodeDLL head, int data, int position) {
		NodeDLL temp=new NodeDLL(data);
		NodeDLL curr=head;
		if(position==1) {
			head.prev=temp;
			temp.next=head;
			return head;
		}
		for(int i=1;i<=position-2 &&curr!=null;i++) {
			curr=curr.next;	
		}
		if(curr==null) return head;
		temp.next=curr.next;
		temp.next.prev=temp;
		curr.next=temp;
		temp.prev=curr;
		return head;
		
		
	}
}
