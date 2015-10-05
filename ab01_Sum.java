import java.util.Scanner;

public class ab01_Sum {
	
	public static int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int a, b;
		
		System.out.println("input data:");
		a = in.nextInt(); b = in.nextInt();
		
		System.out.println(sum(a,b));
		
	}
}