package com.datastructures.BST;

public class PrintLeafNode {

	Node root;
	
	public static void main(String[] args) {
		
		PrintLeafNode b = new PrintLeafNode();

		b.root = new Node(1);
		b.root.left = new Node(2);
		b.root.right = new Node(3);
		b.root.right.left = new Node(4);

		b.root.right.right = new Node(5);
		
		printAllLeafNodes(b.root);
	}

	private static void printAllLeafNodes(Node node) {
		
		int count=0;
		
		if(node==null) 
			return;
		
		if(node.left==null && node.right==null  ) {
			
			System.out.printf("%d  ",node.data);
			System.out.println(count++);
		}
		
		printAllLeafNodes(node.left);
		printAllLeafNodes(node.right);
		
		
		
		
	}
	
	
	
	
}
