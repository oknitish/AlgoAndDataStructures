package com.datastructures.BST;

public class CreateBST {
	static int count=0;
	public static void main(String[] args) {
		CreateBST createBST = new CreateBST();

		Node node = new Node();

		createBST.insert(node, 5);
		createBST.insert(node, 55);
		createBST.insert(node, 17);
		createBST.insert(node, 6);
		createBST.insert(node, 77);
		createBST.insert(node, 41);
		createBST.insert(node, 35);
		createBST.insert(node, 20);

		createBST.preOrder(node);
		
		System.out.println("printing leaf nodes****************");
		createBST.printLeafNodes(node);
	System.out.println("*******leaf node count*********************"+count);
	
	System.out.println("=======================printing ancestors of a given NOD=============================");
	
	printAncestors(node,77);
	
	}

	
	//print all ancestor of a given node
	private static boolean printAncestors(Node node, int data) {
		
		
		
		if(node==null) 
			return false;
			
			
			if(node.data==data) 
				
				return true;
			
			
			if(printAncestors(node.right,data) || printAncestors(node.right,data)) {
				
				System.out.printf("%d ",node.data);
				return true;
				
			}
			
			return false;
		}
		
		
		
	
// print all leaf nodes
	private void printLeafNodes(Node node) {
		
		if(node==null) 
			
		return;
			
		 if(node.left==null && node.right==null)	
		 { 
			 count++; 
			System.out.printf("%d ",node.data); 
			
		 }
			
		 printLeafNodes(node.left);
		 printLeafNodes(node.right);
		
		
		
		
		
	}

	//preorder
	public void preOrder(Node node) {
		if ((node != null)) {
	
			System.out.printf("%d ", node.data);
			preOrder(node.left);
			preOrder(node.right);

		}

	}

	
	// post order
	public void postOrder(Node node) {
		if ((node != null)) {
			
			preOrder(node.left);
			preOrder(node.right);
			System.out.printf("%d ", node.data);
		}

	}
	// inorder
	public void InOrder(Node node) {
		if ((node != null)) {
			
			preOrder(node.left);
			System.out.printf("%d ", node.data);
			preOrder(node.right);

		}

	}
	
	
	
	
	
	
	private Node insert(Node node, int data) {

		
		if (node == null) {
			return node = createNewNode(data);

		}

		else if (data <= node.data) {

			node.left = insert(node.left, data);
		} else if (data > node.data) {
			node.right = insert(node.right, data);
		}
		return node;
	}

	private Node createNewNode(int data) {
		Node node = new Node();

		node.data = data;
		node.left = null;
		node.right = null;

		return node;
	}

}
