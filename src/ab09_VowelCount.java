/**
 * This is a simple problem to get introduced to string processing. 
 * We will be given several lines of text - and for each of them we want to 
 * know the number of vowels (i.e. letters a, o, u, i, e, y). Note: that y is 
 * regarded as vowel for purpose of this task.
 * input data:
 * 4
 * abracadabra
 * pear tree
 * o a kak ushakov lil vo kashu kakao
 * my pyx
 * answer:
 * 5 4 13 2
 */

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
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		in.nextLine();
		
		for (int i = 0; i < size; i++) {
			String line = in.nextLine();
			array[i] = numVowels(line);
		}
		
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} 
		System.out.print(array[size-1]);
	}
}
