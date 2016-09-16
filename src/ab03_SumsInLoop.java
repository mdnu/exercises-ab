/**
 * http://www.codeabbey.com/index/task_view/sums-in-loop
 * Now we are given several pairs of values and we want to calculate sum for each pair.
 * Input data will contain the total count of pairs to process in the first line.
 * The following lines will contain pairs themselves - one pair at each line.
 * Answer should contain the results separated by spaces.
 * data:
 * 3
 * 100 8
 * 15 245
 * 1945 54
 * answer:
 * 108 260 1999
 */

import java.util.Scanner;

public class ab03_SumsInLoop {
	public static long[] index_sum
	(int[] array1, int[] array2, int size) {
		long[] array3 = new long[size];
		
		for (int i=0;i<size;i++) {
			array3[i] = array1[i]+array2[i];
		}
		return array3;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("data:");
		int size = in.nextInt();
		int[] array1 = new int[size], array2 = new int[size];
		
		for (int i=0;i<size;i++) {
			int a = in.nextInt();
			array1[i]=a;
			int b = in.nextInt();
			array2[i]=b;
		}
		
		long[] array3 = index_sum(array1,array2,size);
		for (int i=0;i<size;i++) {
			System.out.print(array3[i]+" ");
		}
	}
}
