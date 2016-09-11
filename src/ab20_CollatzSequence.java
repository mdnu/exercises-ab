import java.util.Scanner;

class ab20_CollatzSequence {
	
	public static int collatzCount(int input) {
		int count = 0;
		while (input > 1) {
			if (input % 2 == 0) {
				input /= 2;
			} else {
				input *= 3;
				input++;
			}
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			int input = in.nextInt();
			array[i] = collatzCount(input);
		}
		
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i]);
			if (i < size-1) {
				System.out.print(" ");
			}
		} 
		
		System.out.print(array[size - 1]);
	}
}
