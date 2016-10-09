/**
 * http://www.codeabbey.com/index/task_view/linear-congruential-generator
 * input data:
 * 2
 * 3 7 12 1 2
 * 2 3 15 8 10
 * answer:
 * 1 11
 */

import java.util.Scanner;

public class ab42_LinearCongruentialGenerator {
	public static int result(int A, int C, int M, int X0, int N) {
		for (int i = 0; i < N; i++) {
			X0 = ((A * X0) + C) % M;
		}
		return X0;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		int A, C, M, X0, N;
		for (int i = 0; i < size; i++) {
			A = in.nextInt();
			C = in.nextInt();
			M = in.nextInt();
			X0 = in.nextInt();
			N = in.nextInt();
			
			array[i] = result(A, C, M, X0, N);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
