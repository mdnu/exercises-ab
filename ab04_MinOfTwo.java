import java.util.Scanner;

public class ab04_MinOfTwo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long[] array = new long[size];
		
		for (int i = 0; i < size; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = (a < b) ? a : b;
		}
		
		for (int i = 0; i < size-1 ; i++) {
			System.out.print(array[i] + " ");
		} System.out.print(array[size - 1]);
		
	}
}
