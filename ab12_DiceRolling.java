import java.util.Scanner;

class ab12_DiceRolling {
	
	public static int convertedValue(double entry) {
		return (((int) Math.floor(entry*6))+1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			double entry = in.nextDouble();
			array[i] = convertedValue(entry);
		}
		
		for (int i=0; i<size-1;i++) {
			System.out.print(array[i]+" ");
		} System.out.println(array[size - 1]);
		
	}
	
}

// goal: a practice in simulating a dice-roll, with
// values from a random number generator.
// suppose we generate random numbers from [0, 1),
// we convert these floating-point values to one of
// six integer numbers. 1 to 6. via the following steps:
// let r be the random value.
// 1. take N*r, where N is the number of distinct values. (6, in this case).
// 2. convert N*r to int. (either via floor, or directly converting).
// 3. given our values range from 1 to 6, we add 1.