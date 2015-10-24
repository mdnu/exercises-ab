import java.util.Scanner;

class ab27_LinearFunction {
	
	private static int x1,y1,x2,y2,a,b;
	
	public static int getA(int x1, int y1, int x2, int y2) {
		return (y1-y2)/(x1-x2);
	}
	
	public static int getB(int a, int y1, int x1) {
		return (y1 -(a*x1));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size =in.nextInt();
		int[][] array = new int[size][size];
		
		for (int i=0; i<size; i++) {
			x1=in.nextInt(); y1=in.nextInt();
			x2=in.nextInt(); y2=in.nextInt();
			
			int a = getA(x1,y1,x2,y2);
			int b = getB(a,y1,x1);
			array[i][0]=a;
			array[i][1]=b;
		}
		
		for (int i=0; i<size; i++) {
			System.out.print("("+array[i][0]+" "+array[i][1]+")");
			if (i<size-1) {
				System.out.print(" ");
			}
		}
	
	}
}
