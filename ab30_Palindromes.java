import java.util.Scanner;

class ab30_Palindromes {
	
	public static String regularExpression = "[^A-z]";
	
	public static String reverseString(String input) {
		int inputLength = input.length();
		String output = "";
		for (int i=inputLength-1; i>=0; i--) {
			output+=input.charAt(i);
		}
		return output;
	}
	
	public static String modInput(String rawInput) {
		String input = rawInput.toLowerCase().replaceAll(regularExpression, "");
		return input;
	}
	
	public static String palindromeCheck(String input, String output) {
		if (input.equals(output)) {
			return "Y";
		} else {
			return "N";
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		in.nextLine();
		
		for (int i=0; i<size; i++) {
			String rawInput = in.nextLine();
			String input = modInput(rawInput);
			array[i]=(palindromeCheck(input, reverseString(input)));
		}
		
		for (int i=0; i<size; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		}
		
	}
	
}