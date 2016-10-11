/**
 * http://www.codeabbey.com/index/task_view/matching-words
 * input data:
 * nun lam mip tex bal pif sot bal bod tex end
 * answer:
 * bal tex
 */

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ab43_MatchingWords {
	public static SortedMap<String, Integer> StringMap(String[] array) {
		SortedMap<String, Integer> StringMap = new TreeMap<String, Integer>();
		Integer index;
		for (String s : array) {
			if (!StringMap.containsKey(s)) {
				StringMap.put(s, 0);
			}
			index = StringMap.get(s);
			StringMap.put(s, index + 1);
		}
		return StringMap;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(" ");
		SortedMap<String, Integer> outputMap = StringMap(array);
		
		for (String s : outputMap.keySet()) {
			if (outputMap.get(s) > 1) {
				System.out.print(s);
				if (s != outputMap.lastKey()) {
					System.out.print(" ");
				}
			}
		}
	}
}
