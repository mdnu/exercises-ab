import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ab28_NeumannsRG {
	
	public static int returnResult(int input) {
		int count = 0;
		Integer initial = Integer.valueOf(input);
		Set<Integer> set = new HashSet<Integer>();
		do {
			set.add(initial);
			initial = (initial*initial)/100 % 10000;
			count++;
		} while (!set.contains(initial));
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			int input = in.nextInt(); 
			array[i] = returnResult(input);	
		}
		
		for (int i=0; i<size; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		}
		
	}
}


/* here we learn how pseudorandom numbers are generated.
"pseudorandom" numbers are a sequence of numbers which are
seemingly independent.

the algorithm we have is this:
1. choose a 4-digit initial value within [0000,9999]
	let this be S_0 in the sequence.
2. square that value to get an 8 digit value 
	(add leading zeros if necessary).
3. truncate two first digits and two last digits in
	this number's decimal representation.
4. this new value will contain 4 digits and will be
	S_1.
5. Continue generating values from step 2 onwards.

example:
5761              - let it be the first number
5761 * 5761 = 33189121  - raised to power 2
33(1891)21 => 1891     - truncate to get the middle

1891              - it is the second number in the sequence
1891 * 1891 = 3575881    - raised to power 2 (add leading zero to get 8 digits)
03(5758)81 => 5758    - truncate to get the middle

5758    - it is the third number in the sequence (and so on...)

sooner or later, each sequence will arrive at a loop:

0001 -> 0000 -> 0000        - came to loop after 2 iterations
4100 -> 8100 -> 6100 -> 2100 -> 4100   - came to loop after 4 iterations

(does this remind you of the Collatz conjecture?)

Task:
we're given initial numbers for several sequences. 
for each of them, report the number of iterations needed 
to come to repetition. */
