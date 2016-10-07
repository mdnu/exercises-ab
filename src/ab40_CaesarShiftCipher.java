/**
 * http://www.codeabbey.com/index/task_view/caesar-shift-cipher
 * input data:
 * 2 3
 * YHQL YLGL YLFL.
 * HYHQ BRX EUXWXV.
 * answer:
 * VENI VIDI VICI. EVEN YOU BRUTUS.
 */

import java.util.Scanner;

public class ab40_CaesarShiftCipher {
	public static char cipher(char c, int wordCount) {
		char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int temp2;
		if (Character.isAlphabetic(c)) {
			temp2 = (c - 'A') - wordCount;
			if (temp2 < 0) {
				temp2 += 26;
			}
			return (ALPHABET[temp2 % 26]);
		} else {
			return (c);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int lineCount = in.nextInt();
		int wordCount = in.nextInt();
		char[] temp;
		System.out.println();
		
		for (int i = 0; i < lineCount + 1; i++) {
			temp = in.nextLine().toCharArray();
			for (int j = 0; j < temp.length; j++) {
				char c = cipher(temp[j], wordCount);
				System.out.print(c);
				if (j == temp.length - 1) {
					System.out.print(" ");
				}
			}
		}
	}
}
