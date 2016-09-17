/**
 * http://www.codeabbey.com/index/task_view/array-checksum
 * input data:
 * 6
 * 3 1 4 1 5 9
 * answer:
 * 8921379
 */

import java.util.Scanner;

class ab16_ArrayChecksum {
	public static long checkSumProduct(long result) {
		long newResult = (113 * result) % 10000007;
		return newResult;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long result = 0;
		
		for (int i = 0; i < size; i++) {
			result += in.nextInt();
			result = checkSumProduct(result);
		}
		System.out.print(result);
	}
}
