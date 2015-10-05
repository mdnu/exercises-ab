import java.util.Scanner;

class ab06_MaxOfArray {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
			
		for (int i=0; i<300; i++) {
			int a = in.nextInt();
			if (a < minValue) {
				minValue = a;
			} else if (a > maxValue) {
				maxValue = a;
			}
		} 
		
		System.out.println(maxValue + " " + minValue);
	}
}

// Introduce the 'linear search' algorithm, used for sorting.
// for finding the extremas of a sequence of values:
// algorithm: store 'current maximum' in a separate value,
// then run through array, comparing each of its elements to
// this variable. whenever the next value is greater, this
// value becomes the new maximum. (simple enough).