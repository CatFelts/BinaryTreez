package FunTimeSortSortFun;

public class FunFunSort {

	public static void main(String[] args) {
		int[] myArray = { 3, 7, 9, 12, 1, 6, 4};
		BubbleSort bSort = new BubbleSort(myArray);
		System.out.println("before sorting:");
		bSort.printArray();
		bSort.sortArray();
		System.out.println("after sorting:");
		bSort.printArray();
		
		BubbleSort kLargestProb = new BubbleSort(myArray);
		System.out.println("before sorting:");
		kLargestProb.printArray();
		System.out.println("finding 4 largest elements...");
		kLargestProb.sortKPasses(4);
		System.out.println("after finding 4 largest elements:");
		kLargestProb.printLastK(4);
	}

}
