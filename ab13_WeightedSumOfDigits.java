import java.util.Scanner;

class ab13_WeightedSumOfDigits {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			String index = in.next();
			
			int entry = 0;
			for (int j = 1; j<index.length()+1; j++) {
				entry += j*Integer.parseInt(""+index.charAt(j-1));
			}
			array[i] = entry;
		}
		for (int i=0; i<size-1; i++) {
			System.out.print(array[i] + " ");
		} System.out.print(array[size - 1]);
		
	}
	
}

// this program resembles more complex algorithms for calculation CRC
// 'CRC' i.e. 'cyclic redundancy check'., and other checksums and also
// hash-functions on character strings.
// here, we calculate the sum of digits, but multiplying each digit by
// its position (counting from the left, starting from 1).
// i.e. for '1776', wsd(1776) = 1*1 +7*2 + 7*3 + 6*4 = 60,
// i.e. inner product of (1, 7, 7, 6) and (1, 2, 3, 4).