import java.math.BigInteger;
import java.io.*;

class ab22_ModularCalculator {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = 
		new BufferedReader(new InputStreamReader(System.in));
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

// setup:
// input data: initial integer number in first line.
// one or more lines describing the operations, in form
// 'sign value' where sign is either + or * and value
// is an integer. last line in the same form, but with
// % instead, and the number by which the result should
// be divided by to get the remainder.

/* import java.math.BigInteger;
import java.io.*;

class ab22_ModularCalculator {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = 
		new BufferedReader(new InputStreamReader(System.in));
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
	
} */

/* import java.util.Scanner;

class ab22_ModularCalculator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double input = in.nextDouble();
		
		while(!in.hasNext("%")) {
			if (in.next().contains("*")) {
				int x = in.nextInt();
				input*=x;
			} else {
				int x = in.nextInt();
				input*=x;
			}
		}
		in.next();
		input%=in.nextInt();
		System.out.print((int) input);
	}
	
} */