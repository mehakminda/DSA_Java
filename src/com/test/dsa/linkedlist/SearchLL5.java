package com.test.dsa.linkedlist;

public class SearchLL5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		NodeSLL head=new NodeSLL(10);
		NodeSLL temp1=new NodeSLL(30);
		NodeSLL temp2=new NodeSLL(20);
		NodeSLL temp3=new NodeSLL(40);
		head.next=temp1;
		temp1.next=temp2; //head.next.next=temp2;
		temp2.next=temp3;
		
		System.out.println("Create a linked list");
		ImplementationLL1.traversal_SLL_Iterative(head);
		System.out.println();
		
		
		int position;
		position=SearchLLIterative(head,10);
		System.out.println("Search 10 in  a linked list: "+ position);
		position=SearchLLIterative(head,40);
		System.out.println("Search 40 in  a linked list: "+ position);
		position=SearchLLIterative(head,50);
		System.out.println("Search 50 in  a linked list: "+ position);
		
		
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("");
		
		position=SearchLLRecursive(head,10,1);
		System.out.println("Search 10 in  a linked list: "+ position);
		position=SearchLLRecursive(head,40,1);
		System.out.println("Search 40 in  a linked list: "+ position);
		position=SearchLLRecursive(head,50,1);
		System.out.println("Search 50 in  a linked list: "+ position);




	}
	
	//O(n) time and O(1) space
	public static int SearchLLIterative(NodeSLL head, int x) {
		int pos=1;
		while(head!=null) {
			if(head.data==x) {
				return pos;
			}
			else {
				head=head.next;
				pos++;
			}
		}
		return -1;
	}
	
	//O(n) time and O(n) space
	public static int SearchLLRecursive(NodeSLL head, int x , int pos) {
		if(head==null) return -1;
		if(head.data==x) return pos;
		else return SearchLLRecursive(head.next,x,pos+1);
		
	}

}
