/**
 * http://www.codeabbey.com/index/task_view/bicycle-race
 * input data:
 * 2
 * 10 1 1
 * 20 1 2
 * answer:
 * 5 6.66666667
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ab32_BicycleRace {
	public static DecimalFormat DEC = new DecimalFormat("#.########");
	
	public static String meetPointDist(double dist, int speedA, int speedB) {
		int distCovered = speedA + speedB;
		double time = dist / distCovered;
		double meetPointDist = speedA * time;
		return DEC.format(meetPointDist);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
			if (i < size - 1) {
				System.out.print(" ");
			}
		}
	}
}
