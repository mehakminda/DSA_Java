package com.test.dsa.linkedlist;

public class ImplementationDLL5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL head= new NodeDLL(10);
		NodeDLL temp1=new NodeDLL(30);
		NodeDLL temp2=new NodeDLL(20);
		
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		
		traversal_DLL_Iterative(head);
		System.out.println();
		traversal_DLL_Recursive(head);
		
		

	}
	//O(n) time and O(1) space
	public static void traversal_DLL_Iterative(NodeDLL head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}
	
	//O(n) time and O(n) space
	public static void traversal_DLL_Recursive(NodeDLL head) {
		if(head==null) return;
		else {
			System.out.print(head.data+" ");
			traversal_DLL_Recursive(head.next);
		}
		
	}

}

class NodeDLL{
	int data;
	NodeDLL prev;
	NodeDLL next;
	NodeDLL(int data){
		this.data=data;
		prev=null; //optional, by default its assigned to null
		next=null; 
	}
}
