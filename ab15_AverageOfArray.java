import java.util.Scanner;

class ab15_AverageOfArray {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		double[] array = new double[size];
		
		for (int i=0; i<size; i++) {
			double sum = 0;
			double count = 0;
			int input = -1;
			while (input != 0) {
				input = in.nextInt();
				if (input != 0) {
					sum+=input;
					count++;
				}
			}
			array[i]=(sum/count);
		}
		for (int i=0; i<size-1; i++) {
			System.out.print(Math.round(array[i]) + " ");
		} System.out.print(Math.round(array[size - 1]));
	}
	
}

// a program which calculates the mean of a set of values,
// we are given several arrays, for each of which we find the mean.
// each test case describes an array of integers, with '0' marking end.
// though this 0 is not included in calculations.
// answer for each must be rounded to the nearest integer.