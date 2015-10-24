import java.util.Scanner;

class ab07_Rounding {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long[] array = new long[size];
		
		for (int i=0; i<size; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = (int)Math.round((((double) a)/(double) b));
		}
		
		for (int i=0; i<(size-1); i++) {
			System.out.print(array[i] + " ");
		} 
		
		System.out.println(array[size-1]);
	}
}
