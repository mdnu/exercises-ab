/**
 * http://www.codeabbey.com/index/task_view/bubble-in-array
 * input data:
 * 1 4 3 2 6 5 -1
 * answer:
 * 3 5242536
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ab34_BubbleInArray {
	public static int SWAP = 0;
	public static int SIZE = 0;
	public static long RESULT = 0;
	public static List<Integer> ARRAY = new ArrayList<Integer>();
	
	private static void SWAP(List<Integer> ARRAY, int i, int j) {
		int temp = ARRAY.get(i);
		ARRAY.set(i, ARRAY.get(j));
		ARRAY.set(j, temp);
	}
	
	public static void bubbleSort(List<Integer> ARRAY, int SIZE) {
		for (int i = 0; i < SIZE; i++) {
			if (ARRAY.get(i) > ARRAY.get(i + 1)) {
				SWAP(ARRAY, i, i + 1);
				SWAP++;
			}
		}
	}
	
	public static long checkSumProduct(long RESULT) {
		long newResult = (113 * RESULT) % 10000007;
		return newResult;
	}
	
	public static long checkSum(List<Integer> ARRAY) {
		for (int i = 0; i < SIZE+1; i++) {
			RESULT += ARRAY.get(i);
			RESULT = checkSumProduct(RESULT);
		}
		return RESULT;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while (check) {
			int number = in.nextInt();
			if (number != -1) {
				ARRAY.add(number);
			} else {
				SIZE = ARRAY.size() - 1;
				break;
			}
		}
		bubbleSort(ARRAY, SIZE);
		long checkSumResult = checkSum(ARRAY);
		System.out.println(SWAP + " " + checkSumResult);
	}
}
