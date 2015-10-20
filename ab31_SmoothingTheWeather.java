import java.util.Scanner;
import java.text.DecimalFormat;

class ab31_SmoothingTheWeather {
	
	public static double smoothCalc(double a, double b, double c) {
		return (a+b+c)/3;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		double[] array = new double[size];
		DecimalFormat dec = new DecimalFormat("#.##########");
		
		for (int i=0; i<size; i++) {
			array[i] = in.nextDouble();
		}
		
		for (int i=0; i<size; i++) {
			if ((i==0)||(i==size-1)) {
				System.out.print(dec.format(array[i]));
			} else if (i<size-1) {
				double output = smoothCalc(array[i-1],array[i],array[i+1]);
				System.out.print(dec.format(output));
			} if (i < size-1) {
				System.out.print(" ");
			}
		}
		
	}
}