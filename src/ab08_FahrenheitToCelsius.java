/**
 * http://www.codeabbey.com/index/task_view/fahrenheit-celsius
 * You are to write program to convert degrees of Fahrenheit to Celsius.
 * data:
 * 5 495 353 168 -39 22
 * answer:
 * 257 178 76 -39 -6
 */

import java.util.Scanner;

class ab08_FahrenheitToCelsius {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			double fahrenheitValue = in.nextDouble();
			int celsiusValue = (int) Math.round( (fahrenheitValue - 32) * 5 / 9);
			array[i] = celsiusValue;
		}
		
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.print(array[size-1]);
	}
}
