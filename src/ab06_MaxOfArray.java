/**
 * Linear search algorithm.
 * Input data will give you exactly 300 numbers in a single line.
 * Answer should contain maximum and minimum of these values, separated by space.
 * input data:
 * 1 3 5 7 9 11 ... 295 297 299 300 298 296 ... 12 10 8 6 4 2
 * answer:
 * 300 1
 */

import java.util.Scanner;

class ab06_MaxOfArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
			
		for (int i = 0; i < 300; i++) {
			int a = in.nextInt();
			if (a < minValue) {
				minValue = a;
			} else if (a > maxValue) {
				maxValue = a;
			}
		} 
		System.out.println(maxValue + " " + minValue);
	}
}
