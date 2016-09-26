/**
 * http://www.codeabbey.com/index/task_view/fibonacci-sequence
 * input data:
 * 5
 * 610
 * 34
 * 0
 * 1346269
 * 10946
 * answer:
 * 15 9 0 31 21
 */
 
import java.util.Scanner;
import java.math.*;

public class ab26_Fibonacci {
	public static void main(String[] args) {
		BigInteger[] Fibonacci = new BigInteger[1000];
		Fibonacci[0] = BigInteger.ZERO;
		Fibonacci[1] = BigInteger.ONE;
		
		for (int i = 2; i < 1000; i++) {
			Fibonacci[i] = Fibonacci[i - 1].add(Fibonacci[i - 2]);
		}
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			BigInteger number = in.nextBigInteger();
			for (int j = 0; j < 1000; j++) {
				if (Fibonacci[j].equals(number)) {
					array[i] = j;
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}	
		}
	}
}
