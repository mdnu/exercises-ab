/**
 * http://www.codeabbey.com/index/task_view/arithmetic-progression
 * data:
 * 2
 * 5 2 3
 * 3 0 10
 * answer:
 * 21 30
 */

import java.util.Scanner;

class ab19_ArithmeticProgression {
	public static int arithProg(int A, int B, int C) {
		int result = 0;
		for (int i = 0; i < C; i++) {
			result += (A + (i * B));
		} return result;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i<size; i++) {
			int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
			array[i] = arithProg(A, B, C);
		}
		
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i]);
			if (i < size-1) {
				System.out.print(" ");
			}
		} 
		System.out.print(array[size - 1]);
	}
}
