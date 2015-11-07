import java.util.Scanner;
import java.text.DecimalFormat;

class ab32_BicycleRace {
	
	public static DecimalFormat DEC = new DecimalFormat("#.########");
	
	public static String meetPointDist(double dist, int speedA, int speedB) {
		int distCovered = speedA + speedB;
		double time = dist / distCovered;
		double meetPointDist = speedA * time;
		return DEC.format(meetPointDist);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		int speedA, speedB;
		double dist;
		
		for (int i = 0; i < size; i++) {
			dist = in.nextInt(); speedA = in.nextInt(); speedB = in.nextInt();
			array[i] = meetPointDist(dist, speedA, speedB);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size-1) {
				System.out.print(" ");
			}
		}
		
	}
}
