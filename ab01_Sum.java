import java.util.Scanner;

public class ab01_Sum {
	
	public int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] arg) {
		abbeyOne_Sum im = new abbeyOne_Sum();
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("input data:");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println();
		System.out.println(im.sum(a,b));
	}
}