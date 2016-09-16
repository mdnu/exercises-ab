/**
 * http://www.codeabbey.com/index/task_view/min-of-two
 * Of two numbers, please, select one with minimum value. 
 * Here are several pairs of numbers for thorough testing.
 * Input data will contain number of test-cases in the first line.
 * Following lines will contain a pair of numbers to compare each.
 * For Answer please enter the same amount of minimums separated by space, for example:
 * data:
 * 3
 * 5 3
 * 2 8
 * 100 15
 * answer:
 * 3 2 15
 */

import java.util.Scanner;

public class ab04_MinOfTwo {
	public static int minOfTwo(int a, int b) {
		return (a < b) ? a : b;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long[] array = new long[size];
		
		for (int i = 0; i < size; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = minOfTwo(a, b);
		}
		
		for (int i = 0; i < size - 1 ; i++) {
			System.out.print(array[i] + " ");
		} System.out.print(array[size - 1]);
	}
}
