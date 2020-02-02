package BinaryTreez;

import java.util.Queue;
import java.util.Stack;
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
	
	public void depthFirstPrint()
	{
		if(root == null)
			return;
		
		depthFirstPrint(root);
	}
	
	private void depthFirstPrint(Node node)
	{
		System.out.println(node.getValue());
		Node leftNode = node.getLeftChild();
		if(leftNode != null)
			depthFirstPrint(leftNode);
		Node rightNode = node.getRightChild();
		if(rightNode != null)
			depthFirstPrint(rightNode);
	}
	
	public Node breadthFirstSearch(int value)
	{
		if(root == null)
		{
			System.out.println("Tree is empty.");
			return null;
		}
		
		if(root.getValue() == value)
			return root;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node node = q.remove();
			if(node.getValue() == value)
				return node;
			if(node.getLeftChild() != null)
				q.add(node.getLeftChild());
			if(node.getRightChild() != null)
				q.add(node.getRightChild());
		}
		
		System.out.println("Tree does not contain value: " + value);
		return null;
	}
	
	public Node depthFirstSearch(int value)
	{
		if(root == null)
		{
			System.out.println("Tree is empty.");
			return null;
		}
		
		if(root.getValue() == value)
			return root;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			Node current = stack.pop();
			if(current.getValue() == value)
				return current;
			if(current.getLeftChild() != null)
				stack.push(current.getLeftChild());
			if(current.getRightChild() != null)
				stack.push(current.getRightChild());
		}
		System.out.println("Tree does not contain value: " + value);
		return null;
	}
	
	private void print(String msg)
	{
		System.out.println(msg);
	}
	/*
	 * return true if two trees are identical, else return false
	 * iterative approach
	 */
	public boolean areTreesEqualIt(Node binaryTreeRoot)
	{
		if(binaryTreeRoot == null && this.root == null)
		{
			print("Both trees are null");
			return true;
		}
		
		if(binaryTreeRoot.getValue() != root.getValue())
		{
			return false;
		}
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		q1.add(root);
		q2.add(binaryTreeRoot);
		
		while(!q1.isEmpty() && !q2.isEmpty())
		{
			Node node1 = q1.remove();
			Node node2 = q2.remove();
			
			if(node1.getValue() != node2.getValue())
			{
				return false;
			}
			
			Node leftChild1 = node1.getLeftChild();
			Node leftChild2 = node2.getLeftChild();
			if(leftChild1 != null )
			{
				if(leftChild2 != null)
				{
					q1.add(leftChild1);
					q2.add(leftChild2);
				}
				else
				{
					return false; //one tree has a leaf node where the other does not
				}
			}
			else if(leftChild2 != null)
			{
				return false; //one tree has a leaf node where the other does not
			}
			//else both trees have a leaf node
			
			Node rightChild1 = node1.getRightChild();
			Node rightChild2 = node2.getRightChild();
			if(rightChild1 != null )
			{
				if(rightChild2 != null)
				{
					q1.add(rightChild1);
					q2.add(rightChild2);
				}
				else
				{
					return false; //one tree has a leaf node where the other does not
				}
			}
			else if(rightChild2 != null)
			{
				return false; //one tree has a leaf node where the other does not
			}
			//else both trees have a leaf node
		}
		//we got thru the whole tree without finding any differences
		return true;
	}
	
	/*
	 * return true if two trees are identical, else return false
	 * recursive approach
	 */
	public boolean areTreesEqualRec(Node binaryTreeRoot)
	{
		return false;
	}
	
	/*
	 * calculate the height of the tree using an iterative approach
	 */
	public int getHeightIt()
	{
		return 0;
	}
	
	/*
	 * calculate the height of the tree using a recursive approach
	 */
	public int getHeightRec()
	{
		return 0;
	}
	
	private int getHeightRec(int height)
	{
		return 0;
	}
}

