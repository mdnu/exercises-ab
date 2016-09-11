import java.util.Scanner;
import java.text.DecimalFormat;

class ab37_SquareRoot {
	
	public static int A,B;
	public static DecimalFormat dec = new DecimalFormat("#.##########");
	
	public static double Heron(int A, int B) {
		double r = 1;
		for (int i = 0; i < B; i++) {
			r = 0.5 * (r + (A/r));
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		double[] array = new double[size];
		
		for (int i = 0; i < size; i++) {
			A = in.nextInt(); B = in.nextInt();
			array[i] = Heron(A, B);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(dec.format(array[i]));
			if (i < size) {
				System.out.print(" ");
			}
		}		
	}	
}
