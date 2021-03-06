/**
 * http://www.codeabbey.com/index/task_view/pythagorean-theorem
 * input data:
 * 3
 * 6 8 9
 * 9 12 15
 * 16 12 22
 * answer:
 * A R O
 */

import java.util.Scanner;

public class ab36_PythagoreanTheorem {
	public static int A, B, C;
	public static double D;
	
	public static String decision(int A, int B, int C) {
		D = Math.sqrt(A * A + B * B);
		String decision = (D == C) ? "R" : (D < C) ? "O" : "A";
		return decision;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		
		for (int i = 0; i < size; i++) {
			A = in.nextInt(); B = in.nextInt(); C = in.nextInt();
			array[i] = decision(A, B, C);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
