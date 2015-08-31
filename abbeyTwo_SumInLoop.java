import java.util.Scanner;

public class abbeyTwo_SumInLoop {
	
	public int sum(int[] array, int size) {
		int sum = 0;
		for (int i=0;i<size;i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		abbeyTwo_SumInLoop im = new abbeyTwo_SumInLoop();
		Scanner in = new Scanner(System.in);
		System.out.println("input data:");
		int size = in.nextInt();
		int[] array = new int[size];
		for (int i=0;i<size;i++) {
			int a = in.nextInt();
			array[i]=a;
		}
		System.out.println(im.sum(array,size));
	}
	
}
