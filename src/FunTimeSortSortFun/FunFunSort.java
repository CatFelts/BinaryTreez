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
		
		
		MergeSort mSort = new MergeSort();
		
		print(mSort.sort(myArray));
	}
	
	public static void print(int[] arr)
	{
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(", " + arr[i]);
		}
		System.out.print(" ]");
	}

}
