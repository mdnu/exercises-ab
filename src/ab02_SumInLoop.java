/**
 * http://www.codeabbey.com/index/task_view/sum-in-loop
 * Input data has the following format:
 * first line contains N - amount of values to sum;
 * second line contains N values themselves.
 * Answer should contain a single value - the sum of N values.
 * input data:
 * 8
 * 10 20 30 40 5 6 7 8
 * answer:
 * 126
 */

import java.util.Scanner;

public class ab02_SumInLoop {
	public static int sum(int[] array, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			int a = in.nextInt();
			array[i] = a;
		}
		System.out.println(sum(array, size));
	}	
}
