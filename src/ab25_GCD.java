/**
 * http://www.codeabbey.com/index/task_view/greatest-common-divisor
 * input data:
 * 2
 * 2 3
 * 4 10answer:
 * (1 6) (2 20)
 */

import java.util.Scanner;

public class ab25_GCD {
	public static int gcd(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		
		int gcd = (a != 0) ? a : b;
		return gcd;
	}
	
	public static int lcm(int a, int b) {
		int gcd_ab = gcd(a,b);
		int c = a * b;
		return c / gcd_ab;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		int a, b;
		
		for (int i = 0; i < size; i++) {
			a = in.nextInt(); b = in.nextInt();
			int gcd_result = gcd(a,b);
			int lcm_result = lcm(a, b);
			array[i] = ("(" + gcd_result + " " + lcm_result + ")");
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
