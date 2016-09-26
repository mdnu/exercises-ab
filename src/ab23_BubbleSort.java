/**
 * http://www.codeabbey.com/index/task_view/bubble-sort
 * input data:
 * 8
 * 3 1 4 1 5 9 2 6
 * answer:
 * 5 8
 */

import java.util.Scanner;

public class ab23_BubbleSort {
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
			for (int i = 0; i < size-1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					SWAP++;
					continueSort = true;
				}
				if (i == size - 2) {
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
		
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		
		bubbleSort(array, size);
		System.out.print(PASS + " " + SWAP);
	}
}
