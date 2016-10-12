/**
 * http://www.codeabbey.com/index/task_view/modular-calculator
 * input data:
 * 5
 * + 3
 * * 7
 * + 10
 * * 2
 * * 3
 * + 1
 * % 11
 * answer:
 * 1
 */

import java.math.BigInteger;
import java.io.*;

public class ab22_ModularCalculator {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BigInteger input = new BigInteger(in.readLine());
		char operation;
		String temp;
		
		while ((temp = in.readLine()) != null && temp.trim().length() > 0) {
			BigInteger step = new BigInteger(temp.substring(2));
			operation = temp.charAt(0);
			
			switch(operation) {
				case ('*'): {
					input = input.multiply(step);
					break;
				}
				case ('+'): {
					input = input.add(step);
					break;
				}
				case('%'): {
					input = input.mod(step);
					break;
				}
			}
		}
		System.out.print(input);
	}
}
