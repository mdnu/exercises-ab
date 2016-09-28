/**
 * http://www.codeabbey.com/index/task_view/josephus-problem
 * initial data:
 * 10 3
 * answer:
 * 4
 */

import java.util.Scanner;

public class ab33_JosephusProblem {
	public static int N, K;
	public static int dynamicSol(int N, int K) {
		if (N == 1) {
			return 1;
		} else {
			int solution = ((dynamicSol(N - 1, K) + (K - 1)) % N) + 1;
			return solution;
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		N = in.nextInt(); K = in.nextInt();
		System.out.print(dynamicSol(N, K));
	}
}
