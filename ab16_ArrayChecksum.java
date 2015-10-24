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
