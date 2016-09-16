/**
 * Let us calculate sum of digits, as earlier, but multiplying each digit by its position 
 * (counting from the left, starting from 1). For example, given the value 1776 we calculate 
 * such weighted sum of digits (let us call it "wsd") as:
 * wsd(1776) = 1 * 1 + 7 * 2 + 7 * 3 + 6 * 4 = 60
 * input data:
 * 3
 * 9 15 1776
 * answer:
 * 9 11 60
 */

import java.util.Scanner;

class ab13_WeightedSumOfDigits {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			String index = in.next();
			
			int entry = 0;
			for (int j = 1; j < index.length() + 1; j++) {
				entry += j*Integer.parseInt("" + index.charAt(j - 1));
			}
			array[i] = entry;
		}
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.print(array[size - 1]);	
	}
}
