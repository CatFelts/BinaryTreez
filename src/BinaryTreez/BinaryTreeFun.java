package BinaryTreez;

public class BinaryTreeFun {
	
	public static void main(String[] args)
	{		
		BinaryTree binTree = new BinaryTree();
		
		binTree.insert(2);
		binTree.insert(1);
		binTree.insert(6);
		
		binTree.breadthFirstPrint();
	}

}
