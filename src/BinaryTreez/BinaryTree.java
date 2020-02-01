package BinaryTreez;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
	
	private Node root;
	
	BinaryTree()
	{
		this.root = null;
	}
	
	BinaryTree(Node root)
	{
		this.root = root;
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public void insert(int value)
	{
		root = insertNode(root, value);
	}
	
	private Node insertNode(Node current, int value)
	{
		//leaf node
		if(current == null)
		{
			return new Node(value);
		}
		
		if(value < current.getValue())
		{
			current.setLeftChild(insertNode(current.getLeftChild(), value));
		}
		else if(value > current.getValue())
		{
			current.setRightChild(insertNode(current.getRightChild(), value));
		}
		else if(value == current.getValue())
		{
			System.out.println("Duplicate value detected, not inserting.");
		}
		return current;
	}

	public void breadthFirstPrint()
	{
		if(root == null)
			return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node node = q.remove();
			System.out.println(node.getValue());
			
			if(node.getLeftChild() != null)
				q.add(node.getLeftChild());
			if(node.getRightChild() != null)
				q.add(node.getRightChild());
		}
	}
}
