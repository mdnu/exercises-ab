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
		} 
		
		System.out.println(array[size - 1]);
	}
}
