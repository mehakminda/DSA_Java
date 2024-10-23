package com.test.dsa.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class BinaryTree {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Node root =createTree();
		
		System.out.println("Inorder: ");
		printInorderBinaryTree(root);
		System.out.println();
		System.out.println("Pre-order: ");
		printPreorderBinaryTree(root);
		System.out.println();
		System.out.println("Post-order: ");
		printPostorderBinaryTree(root);
		System.out.println();
		System.out.println("Height of BinaryTree: "+heightBinaryTree(root));
		System.out.println("Size of BinaryTree: "+sizeBinaryTree(root));
		System.out.println("Max of BinaryTree: "+maxBinaryTree(root));
		System.out.println("Min of BinaryTree: "+minBinaryTree(root));
		System.out.println("Level order Traversal of BinaryTree:(using  queues) ");
		 levelOrderTraversalBinaryTree(root);
		 System.out.println();
		 System.out.println("Level order Traversal of BinaryTree:(using queues: type2) ");
		 levelOrderTraversalBinaryTree2(root);
		 System.out.println();
		 System.out.println("Top View: ");
		 topViewBinaryTree(root);
		 System.out.println();
		 System.out.println("Bottom view: ");
		 bottomVewBinaryTree(root);
		 System.out.println();
	}
	
	public static  Node createTree() {
		Node root=null; //what does this mean, object is null??
		System.out.println("Enter the data");
		int data=sc.nextInt();
		if(data==-1) return null;
		root=new Node(data);
		System.out.println("Enter the left of "+ data);
		root.left=createTree();
		System.out.println("Enter the right of "+data);
		root.right=createTree();
		return root;
	}
	
	public static void printInorderBinaryTree(Node root) {
		if (root==null) return;
		printInorderBinaryTree(root.left);
		System.out.print(root.data+" ");
		printInorderBinaryTree(root.right);
	
	}
	
	public static void printPostorderBinaryTree(Node root) {
		if (root==null) return;
		printPostorderBinaryTree(root.left);
		printPostorderBinaryTree(root.right);
		System.out.print(root.data +" ");
	
	}
	
	public static void printPreorderBinaryTree(Node root) {
		if (root==null) return;
		System.out.print(root.data+" ");
		printPreorderBinaryTree(root.left);
		printPreorderBinaryTree(root.right);
	
	}
	
	public static int heightBinaryTree(Node root) {
		if (root==null) return 0;
		return Math.max(heightBinaryTree(root.left), heightBinaryTree(root.right))+1;
	}

	public static int sizeBinaryTree(Node root) {
		if(root==null )return 0;
		return sizeBinaryTree(root.left)+sizeBinaryTree(root.right)+1;
	}
	public static int maxBinaryTree(Node root) {
		if(root==null )return Integer.MIN_VALUE;
		return Math.max(Math.max(maxBinaryTree(root.left), maxBinaryTree(root.right)), root.data);
	}
	public static int minBinaryTree(Node root) {
		if(root==null )return Integer.MAX_VALUE;
		return Math.min(Math.min(minBinaryTree(root.left), minBinaryTree(root.right)), root.data);
	}
	public static void levelOrderTraversalBinaryTree(Node root) {
		Queue <Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node current=q.poll();
			System.out.print (current.data+" ");
			if(current.left!=null) q.add(current.left);
			if(current.right !=null) q.add(current.right);
			
		}
		
	}
	public static void levelOrderTraversalBinaryTree2(Node root) {
		//print Binary tree in  level order traversal manner with each level printed in a seperate line
		Queue <Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node current=q.poll();
			if(current==null) {
				if(q.isEmpty()) return ;
				q.add(null);
				System.out.println();
				continue;
			}
			System.out.print (current.data+" ");
			if(current.left!=null) q.add(current.left);
			if(current.right !=null) q.add(current.right);	
		}
	}
	
	public static void printLeftView(Node root) {
		ArrayList<Node> list=new ArrayList<Node>();
		printLeftViewUtil(root, list,0);
		for(Node curr:list) {
			System.out.println(curr.data+" ");
		}
	}
	public static void printLeftViewUtil(Node root, ArrayList<Node> list, int level) {
		if(root==null) return;
		if(list.get(level)==null) {
			list.add(root);
		}
		printLeftViewUtil(root.left,list,level+1);
		printLeftViewUtil(root.right,list,level+1);
	}
	
	public static void topViewBinaryTree(Node root) {
		Queue<Pair> q=new ArrayDeque<>();
		Map<Integer,Integer> map=new TreeMap<>();
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair current=q.poll();
			if(!map.containsKey(current.hd)) {
				map.put(current.hd, current.node.data);
			}
			if(current.node.left!=null) {
				q.add(new Pair(current.hd-1,current.node.left));
			}
			if(current.node.right!=null) {
				q.add(new Pair(current.hd+1,current.node.right));
			}
			
		}
		//ArrayList<Integer> ans=new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue()+" ");
		}
		
	}
	
	public static void bottomVewBinaryTree(Node root) {
		Queue<Pair> q=new ArrayDeque<>();
		Map<Integer,Integer> map=new TreeMap<>();
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair current=q.poll();
				map.put(current.hd, current.node.data);
			
			if(current.node.left!=null) {
				q.add(new Pair(current.hd-1,current.node.left));
			}
			if(current.node.right!=null) {
				q.add(new Pair(current.hd+1,current.node.right));
			}
			
		}
		//ArrayList<Integer> ans=new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue()+" ");
		}
	}
	
	 public int diameter(Node root) {
		 if (root==null) return 0;
		 int dl=diameter(root.left);
		 int dr=diameter(root.right);
		 int cur=heightBinaryTree(root.left)+heightBinaryTree(root.right)+1;
		 return Math.max(cur,Math.max(dr, dl));
	 }

	
	
}
class Pair{
	int hd;
	Node node;
	public Pair(int hd,Node node) {
		this.node=node;
		this.hd=hd;
	}
}

class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
	}
}