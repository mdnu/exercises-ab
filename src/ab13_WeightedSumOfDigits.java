import java.util.Scanner;

class ab13_WeightedSumOfDigits {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			String index = in.next();
			
			int entry = 0;
			for (int j = 1; j < index.length() + 1; j++) {
				entry += j*Integer.parseInt("" + index.charAt(j - 1));
			}
			array[i] = entry;
		}
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} 
		
		System.out.print(array[size - 1]);	
	}
}
