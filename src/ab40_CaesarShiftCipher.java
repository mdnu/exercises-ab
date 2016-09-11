import java.util.Scanner;
import java.util.ArrayList;

class ab40_CaesarShiftCipher {
	
	public static char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	public static char[] temp;
	public static int wordCount;
	public static int lineCount;
	
	public static char method(int j) {
		int temp2;
		if (Character.isAlphabetic(temp[j])) {
			temp2 = (temp[j] - 'A') - wordCount;
			if (temp2 < 0) {
				temp2 += 26;
			}
			return (ALPHABET[temp2 % 26]);
		} else {
			return (temp[j]);
		}
	}

	
	public static void main(String[] args) {
		ArrayList<Character> charlist = new ArrayList<Character>();
		ArrayList<String> strlist = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		lineCount = in.nextInt();
		wordCount = in.nextInt();
		
		for (int i = 0; i < lineCount+1; i++) {
			temp = in.nextLine().toCharArray();
			int temp2;
			for (int j = 0; j < temp.length; j++) {
				charlist.add(method(j));
			}
			strlist.set(0, charlist.get(0)+" ");
		}
		
		for (int i = 0; i < strlist.size(); i++) {
			System.out.print(strlist.get(i));
		}
		
	}
	
}