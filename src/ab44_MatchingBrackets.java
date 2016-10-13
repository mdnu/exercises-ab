import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class ab44_MatchingBrackets {
	public static int output(String line, Deque<Character> queue) {
		Character character;
		boolean value = true;
		for (int i = 0; i < line.length(); i++) {
			character = line.charAt(i);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		for (int i = 0; i < size; i++) {
			Deque<Character> queue = new LinkedList<Character>();
			String line = in.nextLine();
		}
	}
}
