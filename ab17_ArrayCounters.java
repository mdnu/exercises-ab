import java.util.Scanner;

class ab17_ArrayCounters {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(); // size
		int N = in.nextInt(); // range
		
		int[] array = new int[N];
		
		for (int i=0; i<M; i++) {
			int next = in.nextInt();
			array[next-1]++;
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(array[i]);
			if (i<N-1) {
				System.out.print(" ");
			}
		}
		
	}
	
}

// task: given an array of length M with numbers
// ranging from 1 to N, for N<=20, we go through
// the array, counting the frequency of each number
// which appears.

// example input/output:
/* data input:
10 3
1 2 3 2 3 1 1 1 1 3

answer:
5 2 3 */