/**
 * http://www.codeabbey.com/index/task_view/sort-with-indexes
 * input data:
 * 4
 * 50 98 17 79
 * answer:
 * 3 1 4 2
 */

import java.util.Scanner;

public class ab29_SortWithIndexes {
	public static int PASS = 0;
	public static int SWAP = 0;
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void bubbleSort(int[] array, int size) {
		boolean continueSort = true;
		
		while (continueSort) {
			continueSort = false;
			for (int i = 0; i < size - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					SWAP++;
					continueSort = true;
				}
				if (i == size-2) {
					PASS++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		int[] array2 = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
			array2[i] = array[i];
		}
		
		bubbleSort(array2, size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array2[i] == array[j]) {
					System.out.print(j + 1 + " ");
				}
			}
		}
	}
}
