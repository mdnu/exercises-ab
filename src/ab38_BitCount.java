/**
 * http://www.codeabbey.com/index/task_view/bit-count
 * input data:
 * 3
 * 1 100 -1
 * answer:
 * 1 3 32
 */

import java.util.Scanner;

public class ab38_BitCount {
	public static String A;
	public static int BitCount(String A) {
		int count = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			A = Integer.toBinaryString(in.nextInt());
			array[i] = BitCount(A);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
