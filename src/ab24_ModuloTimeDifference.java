/**
 * http://www.codeabbey.com/index/task_view/modulo-and-time-difference
 * input data:
 * 3
 * 1 0 0 0 2 3 4 5
 * 5 3 23 22 24 4 20 45
 * 8 4 6 47 9 11 51 13
 * answer:
 * (1 3 4 5) (19 0 57 23) (1 7 44 26)
 */

import java.util.Scanner;

public class ab24_ModuloTimeDifference {
	public static String modTimeDiff(int day1, int hour1, int min1, 
	int sec1, int day2, int hour2, int min2, int sec2) {
		String modTimeDiffs = "";
		long timestamp1 = 60*60*24*day1 + 60*60*hour1 + 60*min1 + sec1;
		long timestamp2 = 60*60*24*day2 + 60*60*hour2 + 60*min2 + sec2;
		long difference = (timestamp1 < timestamp2) 
		? (timestamp2-timestamp1) : (timestamp1-timestamp2);
		
		modTimeDiffs += ("(" + (difference / (60 * 60 * 24)) + " ");
		difference %= (60 * 60 * 24);
		
		modTimeDiffs += ((difference / (60 * 60)) + " ");
		difference %= (60 * 60);
		
		modTimeDiffs += ((difference / 60) + " ");
		difference %= (60);
		
		modTimeDiffs += ((difference) + ") ");
		return modTimeDiffs;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		
		int day1, hour1, min1, sec1,
		day2, hour2, min2, sec2;
		
		for (int i = 0; i < size; i++) {
			day1 = in.nextInt(); hour1 = in.nextInt(); 
			min1 = in.nextInt(); sec1 = in.nextInt();
			day2 = in.nextInt(); hour2 = in.nextInt(); 
			min2 = in.nextInt(); sec2 = in.nextInt();
			
			array[i] = modTimeDiff(day1, hour1, min1, sec1, 
			day2, hour2, min2, sec2);
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
		}
	}
}
