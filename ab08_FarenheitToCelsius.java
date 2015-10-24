import java.util.Scanner;

class ab08_FarenheitToCelsius {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			double fahrenheitValue = in.nextDouble();
			int celsiusValue = (int) Math.round((fahrenheitValue-32)*5/9);
			array[i]=celsiusValue;
		}
		
		for (int i=0; i<size-1; i++) {
			System.out.print(array[i] + " ");
		} System.out.print(array[size-1]);
		
	}
	
}
