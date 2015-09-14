import java.util.Scanner;

class ab10_MedianOfThree {
	
	public int medianOfTriple(int a, int b, int c) {
		if ((a<b && b<c)||(c<b && b<a)||(a<=b&& b<c)||(c<=b && b<a)||
		(a<b && b <=c)||(c<b && b<=a)) {
			return b;
		} else if ((b<c && c<a)||(a<c && c<b)||(b<=c && c<a)||(a<=c && c<b)||
		(b<c && c<=a)||(a<c && c<=b)) {
			return c;
		} else if ((c<a && a<b)||(b<a && a<c)||(c<=a && a<b)||(b<=a && a<c)||
		(c<a && a<=b)||(b<a && a<=c)) {
			return a;
		} else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		int median;
		ab10_MedianOfThree im = new ab10_MedianOfThree();
		for (int i=0; i<size; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			array[i] = im.medianOfTriple(a, b, c);
		}
		for (int i=0; i<size-1;i++) {
			System.out.print(array[i]+ " ");
		} System.out.print(array[size-1]);
		
	}
	
}

// we are given a 3-tuple of integers, and are asked to find the median.
// this exercise is used as part of the 'quicksort' algorithm
// we shall see later.