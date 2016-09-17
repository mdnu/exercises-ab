/**
 * http://www.codeabbey.com/index/task_view/array-counters
 * data input:
 * 10 3
 * 3 2 1 2 3 1 1 1 1 3
 * answer:
 * 5 2 3
 */

import java.util.Scanner;

class ab17_ArrayCounters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(), N = in.nextInt();
		int[] array = new int[N];
		
		for (int i = 0; i < M; i++) {
			int next = in.nextInt();
			array[next - 1]++;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(array[i]);
			if (i < N - 1) {
				System.out.print(" ");
			}
		}
	}
}
