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

// suppose we have three line segments, with lengths
// A, B, C. for our task, we are given n-many 3-tuples
// and we are asked to output 1 if it's possible to form
// a triangle out of them, or 0 otherwise.

// recall law of cosines: c^2 = a^2 + b^2 - 2ab(cos(C)).
// clearly, a triangle is possible iff a^2 + b^2 >=c^2.

// sample input/output:
/* data:
2
3 4 5
1 2 4

answer:
1 0 */