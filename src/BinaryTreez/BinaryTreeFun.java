package BinaryTreez;

public class BinaryTreeFun {
	
	public static void main(String[] args)
	{		
		BinaryTree binTree = new BinaryTree();
		
		binTree.insert(6);
		binTree.insert(3);
		binTree.insert(1);
		binTree.insert(2);
		binTree.insert(4);
		binTree.insert(5);
		binTree.insert(10);
		binTree.insert(8);
		binTree.insert(13);
		
		System.out.println("Breadth first print:");
		binTree.breadthFirstPrint();
		System.out.println("Depht first print");
		binTree.depthFirstPrint();
		
		if(binTree.breadthFirstSearch(13) != null)
			System.out.println("Found value in tree");
		if(binTree.depthFirstSearch(13) != null)
			System.out.println("Found value in tree");
		
		BinaryTree anotherTree = new BinaryTree();
		anotherTree.insert(6);
		anotherTree.insert(3);
		anotherTree.insert(1);
		anotherTree.insert(2);
		anotherTree.insert(4);
		anotherTree.insert(5);
		anotherTree.insert(11);
		anotherTree.insert(8);
		anotherTree.insert(13);
		
		if(binTree.areTreesEqualIt(anotherTree.getRoot()))
		{
			System.out.println("Trees are identical");
		}
		else
		{
			System.out.println("Trees are no identical");
		}
	}

}
