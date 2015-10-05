import java.util.Scanner;

class ab23_BubbleSort {
	
	public static int pass = 0;
	public static int swap = 0;
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void bubbleSort(int[] array, int size) {
		boolean continueSort = true;
		
		while (continueSort) {
			continueSort = false;
			for (int i=0; i<size-1; i++) {
				if (array[i]>array[i+1]) {
					swap(array, i, i+1);
					swap++;
					continueSort = true;
				}
				if (i == size-2) {
					pass++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			array[i] = in.nextInt();
		}
		
		bubbleSort(array, size);
		System.out.print(pass+" "+swap);
	}
}

// sorting is reordering according to some simple
// rule based on comparison. suppose we are given
// an array: a = [3,1,4,1,5,9,2,6] and we want its
// elements to be reordered in non-decreasing order.
// i.e. if i<j then a[i]<a[j].

// bubble sort:
// take a 'pass' through the array, examining all
// pairs of adjacent elements (n-1 pairs for n elements).
// if for any pair of indexes i,i+1 we have a[i]<=a[i+1]
// doesn't hold, 'swap' these two elements.
// repeat such passes until the new pass will do no swaps.

// task: given an array size in the first line, and
// the array in the second, we want to count the number
// of passes and the number of swaps before ordering
// is complete.

// to print the sorted array:
/* 		for (int i = 0; i<size; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		} */