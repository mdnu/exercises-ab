import java.util.Scanner;

class ab39_DoubleDiceRoll {
	
	public static int A, B;
	
	public static int DiceRoll(int A, int B) {
		int C = 2 + (A % 6) + (B % 6);
		return C;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			A = in.nextInt(); B = in.nextInt();
			array[i] = DiceRoll(A, B);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
		
	}
	
}
