package com.test.dsa.linkedlist;

public class TraversalLL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL head=null;
		head=InsertEnd(head, 20);
		head=InsertEnd(head, 20);
		head=InsertEnd(head, 20);
		
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		ImplementationLL1.traversal_SLL_Recursive(head);
		
		

	}
	//insert in beginning
	//insert at end
	//insert at a given position x;
	public static NodeSLL InsertEnd(NodeSLL head, int data) {
		return head;
	}
	
	

}
