/**
 * There are several pairs of numbers. 
 * For each pair you are to divide first by second and return the result, 
 * rounded to the nearest integer.
 * input data:
 * 3
 * 12 8
 * 11 -3
 * 400 5
 * answer:
 * 2 -4 80
 */

import java.util.Scanner;

class ab07_Rounding {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long[] array = new long[size];
		
		for (int i = 0; i < size; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = (int)Math.round( ((double) a) / ((double) b) );
		}
		
		for (int i = 0; i < (size-1); i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.println(array[size-1]);
	}
}
