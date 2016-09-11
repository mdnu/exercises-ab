import java.util.Scanner;

class ab35_RotateString {
	
	public static char[] rotateString(char[] s, int K) {
		if ((s == null)||(s.length == 0)) {
			return s;
		} else {
			if (K>0) {
				reverse(s, 0, s.length - 1);
				reverse(s, s.length - K, s.length - 1);
				reverse(s, 0, s.length - K - 1);
			} else if (K<0) {
				K = -K;
				reverse(s, 0, s.length - 1);
				reverse(s, 0, K - 1);
				reverse(s, K, s.length - 1);
			}
			return s;
		}
	}
	
	public static void reverse(char[] s, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = s[j];
			s[j] = s[i];
			s[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] storage = new String[size];
		
		for (int i = 0; i < size; i++) {
			int K = in.nextInt();
			String input = in.next();
			char[] s = input.toCharArray();
			String output = new String(rotateString(s, K));
			storage[i] = output;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(storage[i]);
			if (i < size-1) {
				System.out.print(" ");
			}
		}
		
	}
}
