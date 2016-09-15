/**
 * http://www.codeabbey.com/index/task_view/dice-rolling
 * 6
 * 0.59558786964
 * 0.861037873663
 * 0.385597702116
 * 0.246237673331
 * 0.808033385314
 * 0.0544673665427
 * answer:
 * 4 6 3 2 5 1
 */

import java.util.Scanner;

class ab12_DiceRolling {
	public static int convertedValue(double entry) {
		return (((int) Math.floor(entry * 6)) + 1);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			double entry = in.nextDouble();
			array[i] = convertedValue(entry);
		}
		
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.println(array[size - 1]);
	}
}
