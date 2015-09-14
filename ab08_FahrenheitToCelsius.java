import java.util.Scanner;

class ab08_FahrenheitToCelsius {
	
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

// Celsius water freezes at 0, and boils at 100.
// Fahrenheit freezes at 32 and boils at 212.
// input data: contains N+1 VALUES, N the first being
// the amount of numbers to convert.