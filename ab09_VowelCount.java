import java.util.Scanner;
import java.util.regex.*;

class ab09_VowelCount {
	
	static String regex = "[aeiouy]";
	static Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
	
	public static int numVowels(String line) {
		int count = 0;
		String newLine = line.toLowerCase();
		Matcher m = p.matcher(newLine);
		while (m.find()) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		ab09_VowelCount im = new ab09_VowelCount();
		in.nextLine();
		
		for (int i=0; i<size; i++) {
			String line = in.nextLine();
			array[i]=im.numVowels(line);
		}
		
		for (int i=0;i<size-1;i++) {
			System.out.print(array[i]+" ");
		} System.out.print(array[size-1]);
		
	}
	
}

// Introduction to string processing.
// given several lines ot text, for each - we wish to
// find the number of vowels that appear. (a,e,i,o,u,y).
// a relatively simple technique, we'll see that it's
// important in cipher-breaking approaches.