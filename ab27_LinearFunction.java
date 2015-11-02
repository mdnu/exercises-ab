import java.util.Scanner;

class ab27_LinearFunction {
	
	private static int X1,Y1,X2,Y2,A,B;
	
	public static int getA(int X1, int Y1, int X2, int Y2) {
		return (Y1-Y2)/(X1-X2);
	}
	
	public static int getB(int A, int Y1, int X1) {
		return (Y1 -(A*X1));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size =in.nextInt();
		int[][] array = new int[size][size];
		
		for (int i=0; i<size; i++) {
			X1=in.nextInt(); Y1=in.nextInt();
			X2=in.nextInt(); Y2=in.nextInt();
			
			int A = getA(X1,Y1,X2,Y2);
			int B = getB(A,Y1,X1);
			array[i][0]=A;
			array[i][1]=B;
		}
		
		for (int i=0; i<size; i++) {
			System.out.print("("+array[i][0]+" "+array[i][1]+")");
			if (i<size-1) {
				System.out.print(" ");
			}
		}
	
	}
}
