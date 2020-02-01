package BinaryTreez;

public class Node {

		private int value;
		private Node leftChild;
		private Node rightChild;
		
		Node(int value)
		{
			this.value = value;
		}
		
		Node(int value, Node leftChild, Node rightChild)
		{
			this.value = value;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
		
		public int getValue()
		{
			return this.value;
		}
		
		public Node getLeftChild()
		{
			return this.leftChild;
		}
		
		public Node getRightChild()
		{
			return this.rightChild;
		}
		
		public int setValue(int newValue)
		{
			this.value = newValue;
			return value;
		}
		
		public void setLeftChild(Node newLeftChild)
		{
			this.leftChild = newLeftChild;
		}
		
		public void setRightChild(Node newRightChild)
		{
			this.rightChild = newRightChild;
		}
}
