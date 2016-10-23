import java.util.Scanner;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ab44_MatchingBrackets {
	public static List<Integer> result(String string) {
		Deque<Character> deque = new LinkedList<Character>();
		List<Integer> array = new ArrayList<>();
		Character c;
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			if ("([{<".indexOf(c) != -1) {
				deque.addFirst(c);
			} else if (")]}>".indexOf(c) != -1) {
				if (deque.isEmpty()) {
					array.add(0);
					break;
				} else if (c == ')') {
					if (deque.getFirst() == '(') {
						deque.removeFirst();
					} else {
						array.add(0);
						break;
					}
				} else if (c == ']') {
					if (deque.getFirst() == '[') {
						deque.removeFirst();
					} else {
						array.add(0);
						break;
					}
				} else if (c == '}') {
					if (deque.getFirst() == '{') {
						deque.removeFirst();
					} else {
						array.add(0);
						break;
					}
				} else if (c == '>') {
					if (deque.getFirst() == '<') {
						deque.removeFirst();
					} else {
						array.add(0);
						break;
					}
				}
			}
		}
		if (array.isEmpty() && !deque.isEmpty()) {
			array.add(1);
		}
		return array;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			String line = in.nextLine();
			int entry = result(line).contains(0) ? 0 : 1;
			array[i] = entry;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
