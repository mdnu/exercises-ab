import java.util.Scanner;

class ab19_ArithmeticProgression {
	
	public static int arithProg(int A, int B, int C) {
		int result = 0;
		for (int i = 0; i<C; i++) {
			result+=(A+(i*B));
		} return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i<size; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			array[i] = arithProg(A, B, C);
		}
		
		for (int i=0; i<size-1; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		} System.out.print(array[size - 1]);
		
	}
	
}

// an arithmetic progression - a series of numbers for which
// the difference between any two sequential values differ by
// some constant. i.e. if we start at A, and the increment
// difference is B, then our sequence is:
// A, A+B, A+B+B, A+B+B+B, ..., A+(n+1)B for n-steps.

// task: we are given n-many test cases.
// for each of the n-lines, we are given A, B, C
// where A is the S_0, B is the difference, and
// C is the number of steps to calculate in the
// sequence, i.e. S_0, ..., S_(C-1).

// example input/output:
/* data:
2
5 2 3
3 0 10

answer:
21 30 */