/**
 * http://www.codeabbey.com/index/task_view/neumanns-random-generator
 * input data:
 * 3
 * 0001 4100 5761
 * answer
 * 2 4 88
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ab28_NeumannsRG {
	public static int returnResult(int input) {
		int count = 0;
		Integer initial = Integer.valueOf(input);
		Set<Integer> set = new HashSet<Integer>();
		do {
			set.add(initial);
			initial = (initial * initial) / 100 % 10000;
			count++;
		} while (!set.contains(initial));
		return count;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			int input = in.nextInt(); 
			array[i] = returnResult(input);	
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
