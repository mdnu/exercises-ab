import java.util.Scanner;

class ab18_ReverseString {
	
	public static String reverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.print(reverseString(input));
	}
}
