/**
 * http://www.codeabbey.com/index/task_view/min-of-three
 * Several triplets of numbers are given to you. 
 * Your task is to select minimum among each of triplets.
 * Input data will contain in the first line the number of triplets to follow.
 * Next lines will contain one triplet each.
 * Answer should contain selected minimums of triplets, separated by spaces.
 * data:
 * 3
 * 7 3 5
 * 15 20 40
 * 300 550 137
 * answer:
 * 3 15 137
 */

import java.util.Scanner;

public class ab05_MinOfThree {
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
			int c = in.nextInt();
			array[i] = minOfTwo((int) array[i], c);
		}
		
		for (int i = 0; i < size - 1; i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.print(array[size - 1]);
	}
}
