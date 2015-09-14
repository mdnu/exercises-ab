import java.util.Scanner;

class ab11_BodyMassIndex {
	
	public String bmiClass(double bmi) {
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
		ab11_BodyMassIndex im = new ab11_BodyMassIndex();
		
		for (int i=0; i<size; i++) {
			double weight = in.nextDouble();
			double height = in.nextDouble();
			double bmi = weight/(height*height);
			array[i] = im.bmiClass(bmi);
		}
		System.out.println("answer:");
		for (int i=0; i<size-1;i++) {
			System.out.print(array[i]+" ");
		} System.out.print(array[size - 1]);
		
	}
	
}

// BMI is defined as weight/(height)^2.
// for weight in kg, height in meters.
// classes are:
// underweight | BMI < 18.5
// normal weight | 18.5 <= BMI < 25.0
// overweight | 25.0 <= BMI < 30.0
// obesity | 30.0 <= BMI

// sample input/output:
/* input data:
3
80 1.73
55 1.58
49 1.91

answer:
over normal under */