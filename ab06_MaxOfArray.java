import java.util.Scanner;

class ab06_MaxOfArray {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
			
		for (int i=0; i<300; i++) {
			int a = in.nextInt();
			if (a < minValue) {
				minValue = a;
			} else if (a > maxValue) {
				maxValue = a;
			}
		} 
		
		System.out.println(maxValue + " " + minValue);
	}
}
