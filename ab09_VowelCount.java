import java.util.Scanner;
import java.util.regex.*;

class ab09_VowelCount {
	
	public static String regex = "[aeiouy]";
	public static Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
	
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
		in.nextLine();
		
		for (int i=0; i<size; i++) {
			String line = in.nextLine();
			array[i]=numVowels(line);
		}
		
		for (int i=0;i<size-1;i++) {
			System.out.print(array[i]+" ");
		} 
		
		System.out.print(array[size-1]);
	}
}
