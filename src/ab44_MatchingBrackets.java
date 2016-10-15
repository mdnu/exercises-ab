import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class ab44_MatchingBrackets {
	public static void output(String line, Deque<Character> queue, boolean value) {
		Character character;
		for (int i = 0; i < line.length(); i++) {
			character = line.charAt(i);
			switch (character) {
				case '(': case '{': case '[': case '<': queue.push(character);
				case ')': case '}': case ']': case '>':
					if (queue.isEmpty()) {
						value = false;
						break;
					} else {
						switch(character) {
							case ')': {
								helper('(', queue, value);
								break;
							}
							case '}': {
								helper('{', queue, value);
								break;
							}
							case ']': {
								helper('[', queue, value);
								break;
							}
							case '<': {
								helper('>', queue, value);
								break;
							}
						}
					}
			}
		}
		if (value) {
			value = queue.isEmpty();
		}
	}
	
	private static void helper(char c, Deque<Character> queue, boolean value) {
		if (queue.peek() == 'c') {
			queue.pop();
		} else {
			value = false;
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		char[] array = new char[size];
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			Deque<Character> queue = new LinkedList<Character>();
			String line = in.nextLine();
			boolean value = true;
			output(line, queue, value);
			array[i] = (value ? '1' : '0');
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
