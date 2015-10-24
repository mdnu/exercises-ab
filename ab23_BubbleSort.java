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
