/**
 * http://www.codeabbey.com/index/task_view/median-of-three
 * You will be again given triplets of numbers, but now the middle of them should be chosen 
 * data:
 * 3
 * 7 3 5
 * 15 20 40
 * 300 550 137
 * answer:
 * 5 20 300
 */

import java.util.Scanner;

class ab10_MedianOfThree {
	public static int medianOfTriple(int a, int b, int c) {
		if ((a < b && b < c) || (c < b && b < a) || (a <= b && b < c) || (c <= b && b < a)||
		(a < b && b <= c) || (c < b && b <= a)) {
			return b;
		} else if ((b < c && c < a) || (a < c && c < b) || (b <= c && c < a) || (a <= c && c < b) ||
		(b < c && c <= a) || (a < c && c <= b)) {
			return c;
		} else if ((c < a && a < b) || (b < a && a < c) || (c <= a && a < b) || (b <= a && a < c) ||
		(c < a && a <= b) || (b < a && a <= c)) {
			return a;
		} else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			array[i] = medianOfTriple(a, b, c);
		}
		
		for (int i=0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} System.out.print(array[size-1]);
	}
}
