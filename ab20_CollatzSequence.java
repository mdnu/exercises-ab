import java.util.Scanner;

class ab20_CollatzSequence {
	
	public static int collatzCount(int input) {
		int count = 0;
		while (input > 1) {
			if (input%2 == 0) {
				input/=2;
			} else {
				input*=3;
				input++;
			}
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			int input = in.nextInt();
			array[i] = collatzCount(input);
		}
		
		for (int i=0; i<size-1; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		} 
		
		System.out.print(array[size - 1]);
	}
}

// suppose we select some initial number X,
// the build a sequence based on the following:
// if X_n is even, then X_(n+1) = (X_n)/2,
// else, X_(n+1) = 3*(X_n) + 1.
// if X is odd, the sequence is monotonic increasing,
// if X is even, the sequence is monotonic decreasing.
// once the sequence reaches 1, it enters the loop:
// 1, 4, 2, 1, 4, 2, 1 ...
// Collatz conjecture states that for any X we choose,
// we will always enter this loop. No proof has been
// found yet.

// task: For n-many numbers given,
// in each case, find how many steps it takes to
// get to 1 and enter the loop.

// example input/output:
/* input data:
3
2 15 97

answer:
1 17 118 */

/* import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Problem14 {
	
	public long MAX = 1000000;
	
	public static void main(String[] args) {
		
		Problem14 im = new Problem14();
		List<Integer> index = new ArrayList<Integer>();
		
		for (int i=0;i<=im.MAX+1;i++) {
			int count = 0;
			long work = i;
			while (work >1) {
				if (work<i) {
					count+=index.get((int)work);
					break;
				} else if (work%2==0) {
					work/=2;
					count++;
				} else {
					work = (3*work)+1;
					count++;
				}
			}
			index.add(i, count);
		}
		
		System.out.println(index.indexOf(Collections.max(index)));
		
	}
} */