import java.util.Scanner;

class ab14_SumOfDigits {
	
	public int sumOfDigits(int result) {
		int sum = 0;
		while (result > 0) {
			sum +=result%10;
			result/=10;
		} return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input data:");
		int size = in.nextInt();
		int[] array = new int[size];
		
		ab14_SumOfDigits im = new ab14_SumOfDigits();
		for (int i=0; i<size; i++) {
			int result = in.nextInt()*in.nextInt()+in.nextInt();
			array[i] = im.sumOfDigits(result);
		}
		System.out.println("answer:");
		for (int i=0; i<size-1; i++) {
			System.out.print(array[i] + " ");
		} System.out.print(array[size - 1]);
		
	}
	
}

// steps:
// 1. first line contains N, the number of values to process.
// 2. N lines will follow, describing the values for which the
// sum of digits should be calculated - by 3 integers: A, B, C.
// 3. for each case, take A*B + C, and calculate the sum of the
// digits of the result.