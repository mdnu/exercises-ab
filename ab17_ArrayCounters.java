import java.util.Scanner;

class ab17_ArrayCounters {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(); // size
		int N = in.nextInt(); // range
		
		int[] array = new int[N];
		
		for (int i=0; i<M; i++) {
			int next = in.nextInt();
			array[next-1]++;
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(array[i]);
			if (i<N-1) {
				System.out.print(" ");
			}
		}
		
	}
}
