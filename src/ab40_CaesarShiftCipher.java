/**
 * Incomplete.
 */

import java.util.Scanner;

public class ab40_CaesarShiftCipher {
	private final static char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static char cipher(char c, int wordCount) {
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
		char c;
		char temp[];
		System.out.println();
		
		for (int i = 0; i < lineCount; i++) {
			temp = in.nextLine().toCharArray();
			for (int j = 0; j < temp.length; j++) {
				c = cipher(temp[j], wordCount);
				System.out.print(c);
				if (j == temp.length - 1) {
					System.out.print(" ");
				}
			}
		}
	}
}
