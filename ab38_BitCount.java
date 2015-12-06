import java.util.Scanner;

class ab38_BitCount {
	
	public static String A;
	
	public static int BitCount(String A) {
		int count = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			A = Integer.toBinaryString(in.nextInt());
			array[i] = BitCount(A);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
		
	}
	
}