/**
 * http://www.codeabbey.com/index/task_view/smoothing-the-weather
 * input data:
 * 7
 * 32.6 31.2 35.2 37.4 44.9 42.1 44.1
 * answer:
 * 32.6 33 34.6 39.1666666667 41.4666666667 43.7 44.1
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ab31_SmoothingTheWeather {
	public static double smoothCalc(double a, double b, double c) {
		return (a + b + c) / 3;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		double[] array = new double[size];
		DecimalFormat dec = new DecimalFormat("#.##########");
		
		for (int i = 0; i < size; i++) {
			array[i] = in.nextDouble();
		}
		
		for (int i = 0; i < size; i++) {
			if ((i == 0)||(i == size-1)) {
				System.out.print(dec.format(array[i]));
			} else if (i < size - 1) {
				double output = smoothCalc(array[i - 1], array[i], array[i + 1]);
				System.out.print(dec.format(output));
			} if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
