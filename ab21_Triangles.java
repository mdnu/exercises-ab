import java.util.Scanner;
import java.util.Arrays;

class ab21_Triangles {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			int[] data = new int[3];
			
			for (int j=0; j<3; j++) {
				data[j] = in.nextInt();
			}
			
			Arrays.sort(data);
			array[i] = (data[0]+data[1] >= data[2]) ? 1 : 0;
		}
		
		for (int i=0; i<size; i++) {
			System.out.print(array[i]);
			
			if (i<size-1) {
				System.out.print(" ");
			}
		}
		
	}
}
