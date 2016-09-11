import java.util.Scanner;

public class ab02_SumInLoop {
	
	public static int sum(int[] array, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			int a = in.nextInt();
			array[i] = a;
		}
		
		System.out.println(sum(array, size));
	}	
}
