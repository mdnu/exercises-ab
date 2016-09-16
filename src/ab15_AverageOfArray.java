/**
 * http://www.codeabbey.com/index/task_view/average-of-array
 * input data:
 * 3
 * 2 3 7 0
 * 20 10 0
 * 1 0
 * answer:
 * 4 15 1
 */

import java.util.Scanner;

class ab15_AverageOfArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		double[] array = new double[size];
		
		for (int i = 0; i < size; i++) {
			double sum = 0;
			double count = 0;
			int input = -1;
			while (input != 0) {
				input = in.nextInt();
				if (input != 0) {
					sum += input;
					count++;
				}
			}
			array[i] = (sum / count);
		}
		
		for (int i = 0; i < size - 1; i++) {
			System.out.print(Math.round(array[i]) + " ");
		} 
		System.out.print(Math.round(array[size - 1]));
	}
}
