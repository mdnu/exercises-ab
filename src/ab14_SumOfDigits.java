/**
 * http://www.codeabbey.com/index/task_view/sum-of-digits
 * input data:
 * 3
 * 11 9 1
 * 14 90 232
 * 111 15 111
 * answer:
 * 1 16 21
 */

import java.util.Scanner;

class ab14_SumOfDigits {
	public static int sumOfDigits(int result) {
		int sum = 0;
		while (result > 0) {
			sum += result % 10;
			result /= 10;
		} return sum;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("input data:");
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			int result = in.nextInt() * in.nextInt() + in.nextInt();
			array[i] = sumOfDigits(result);
		}
		
		System.out.println("answer:");
		for (int i = 0; i < size - 1; i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.print(array[size - 1]);
	}
}
