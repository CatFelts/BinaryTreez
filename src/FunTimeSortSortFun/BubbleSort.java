package FunTimeSortSortFun;

public class BubbleSort {
	
	private int[] intArr;
	
	public BubbleSort(int[] intArr)
	{
		this.intArr = intArr;
	}
	
	public void printArray()
	{
		System.out.print("[ ");
		for(int i = 0 ; i < intArr.length-1; i++)
		{
			System.out.print(intArr[i] + ", ");
		}
		System.out.print(intArr[intArr.length-1] + " ]");
		System.out.println();
	}
	
	public void printLastK(int k)
	{
		System.out.print("{ ");
		for(int i = intArr.length-k; i<intArr.length-1; i++)
		{
			System.out.print(intArr[i] + ", ");
		}
		System.out.print(intArr[intArr.length-1] + " ]");
		System.out.println();
	}
	
	public void sortArray()
	{
		boolean sorted = false;
		int size = intArr.length;
		while(!sorted)
		{
			sorted = true;
			for(int i = 0; i < size -1; i++)
			{
				if(intArr[i+1] < intArr[i])
				{
					swapElements(i, i+1);
					sorted = false;
				}
			}
		}
	}
	
	public void sortKPasses(int k)
	{
		//after k iterations, we are guaranteed that the last k elements of the array will be the k largest elements
		if(k <= 0)
			return;
		
		int size = intArr.length;
		for(int i = 0; i<size-1; i++)
		{
			if(intArr[i+1] < intArr[i])
			{
				swapElements(i, i+1);
			}
		}
		sortKPasses(k-1);
	}
	
	private void swapElements(int indexFrom, int indexTo)
	{
		int tempVal = intArr[indexFrom];
		intArr[indexFrom] = intArr[indexTo];
		intArr[indexTo] = tempVal;
	}
	
}
