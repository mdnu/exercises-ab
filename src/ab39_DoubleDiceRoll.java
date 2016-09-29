/**
 * http://www.codeabbey.com/index/task_view/double-dice-roll
 * input data:
 * 7
 * 193170145 1912748246
 * 753156389 614113621
 * 1824520917 53700559
 * 1288077384 911939603
 * 1939066598 1695763253
 * 1905581606 1811712139
 * 878644967 1090885451
 * answer:
 * 5 8 6 7 9 5 12
 */

import java.util.Scanner;

public class ab39_DoubleDiceRoll {
	public static int A, B;
	public static int DiceRoll(int A, int B) {
		int C = 2 + (A % 6) + (B % 6);
		return C;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			A = in.nextInt(); B = in.nextInt();
			array[i] = DiceRoll(A, B);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
