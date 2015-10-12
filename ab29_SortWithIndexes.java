import java.util.Scanner;

class ab29_SortWithIndexes {
	
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
		int[] array2 = new int[size];
		
		for (int i=0; i<size; i++) {
			array[i] = in.nextInt();
			array2[i] = array[i];
		}
		
		bubbleSort(array2, size);
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (array2[i] == array[j]) {
					System.out.print(j+1 + " ");
				}
			}
		}
		
	}
	
}

/* Learning about how to sort arrays.
suppose we have an array 50 98 17 79 which after sorting 
becomes 17 50 79 98. Now:

17 was at 3-rd place initially
50 was at 1-st place initially
98 was at 2-nd place initially
79 was at 4-th place initially

so result is
3 1 4 2
 */
