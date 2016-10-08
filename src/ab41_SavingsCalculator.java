/**
 * http://www.codeabbey.com/index/task_view/savings-calculator
 * input data:
 * 2
 * 1000 10000 8
 * 50 100 25
 * answer:
 * 30 4
 */

import java.util.Scanner;

public class ab41_SavingsCalculator {
	public static int calculate(double S, double R, double P) {
		int count = 0;
		while (S <= R) {
			S = ((S * P) * 100.0) / 100.0;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double size = in.nextDouble();
		
		for (int i = 0; i < size; i++) {
			double S = in.nextDouble();
			double R = in.nextDouble();
			double P = (1 + (in.nextDouble() / 100));
			int result = calculate(S, R, P);
			System.out.print(result);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
