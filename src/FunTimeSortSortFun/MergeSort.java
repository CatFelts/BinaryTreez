package FunTimeSortSortFun;

import java.util.Arrays;

public class MergeSort {
	
	
	public MergeSort()
	{
	}
	
	public int[] sort(int[] A)
	{
		if(A.length <= 1)
			return A;
		int leftIndex = 0;
		int rightIndex = A.length-1;
		//find the middle point
		int middle = (leftIndex + rightIndex) /2;
		//call mergesort on left half
		int[] L = Arrays.copyOfRange(A, leftIndex, middle+1);
		int[] leftArr = sort(L);
		//return new int[3];
		//call mergesort of right half
		int[] R = Arrays.copyOfRange(A, middle+1, rightIndex +1);
		int[] rightArr = sort(R);
		//merge the two halves
		return merge(leftArr, rightArr);
	}
	
	private int[] merge(int[] left, int[]right)
	{
		//i is lefts index, j is rights index, k is mergeds index
		int i=0, j=0, k=0;
		int[] merged = new int[left.length + right.length];
		while(k < merged.length)
		{
			if(i > left.length -1)
			{
				merged[k] = right[j];
				j++;
			}
			else if(j > right.length -1)
			{
				merged[k] = left[i];
				i++;
			}
			else if(left[i] < right[j])
			{
				merged[k] = left[i];
				i++;
			}
			else if(right[j] >= left[i])
			{
				merged[k] = right[j];
				j++;
			}
			k++;
		}
		return merged;
	}

}
