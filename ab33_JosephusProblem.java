/* Given N-many people and a constant step K,
we must find the position (from 1 to N) of
the person who survives. */

import java.util.Scanner;

class ab33_JosephusProblem {
	
	public static int N, K;
	
	public static int dynamicSol(int N, int K) {
		if (N == 1) {
			return 1;
		} else {
			int solution = ((dynamicSol(N - 1, K)+(K - 1)) % N) + 1;
			return solution;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt(); K = in.nextInt();
		System.out.print(dynamicSol(N, K));
	}
}
