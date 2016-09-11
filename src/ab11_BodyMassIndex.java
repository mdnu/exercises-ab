import java.util.Scanner;

class ab11_BodyMassIndex {
	
	public static String bmiClass(double bmi) {
		if (bmi < 18.5) {
			return "under";
		} else if (18.5 <= bmi && bmi < 25.0) {
			return "normal";
		} else if (25.0 <= bmi && bmi < 30.0) {
			return "over";
		} else {
			return "obese";
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input data:");
		int size = in.nextInt();
		String[] array = new String[size];
		
		for (int i = 0; i < size; i++) {
			double weight = in.nextDouble();
			double height = in.nextDouble();
			double bmi = weight / (height*height);
			array[i] = bmiClass(bmi);
		}
		System.out.println("answer:");
		for (int i = 0; i < size-1; i++) {
			System.out.print(array[i] + " ");
		} 
		
		System.out.print(array[size - 1]);
	}
}
