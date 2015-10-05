import java.util.Scanner;

class ab16_ArrayChecksum {
	
	public static long checkSumProduct(long result) {
		long newResult = (113*result)%10000007;
		return newResult;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long result = 0;
		
		for (int i=0; i<size; i++) {
			result += in.nextInt();
			result = checkSumProduct(result);
		}
		
		System.out.print(result);
	}
}

// checksums are small values calculated from big amounts of data
// to test whether the data is consistent. i.e. error-checking.
// i.e. A sends file to B, B calculates the file's checksum and
// compares it with the checksum provided by A.
// another application: bank-cards have checksum in its last digits.

// for programming several further tasks, we'll use a similar way
// in checking whether the result (an array) is correct or not.
// to prepare for this, we'll practice using the checksum algorithm.

// we will be given an array for which the checksum should be
// calculated. the algorithm is as follows:
// 1. for each element of the array, add this element to 'result'
// 2. multiply this sum by 113. take this product mod 10000007,
// 3. let 'result' = product mod 10000007, and so on.