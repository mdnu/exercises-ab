import java.util.Scanner;

class ab24_ModuloTimeDifference {
	
	public static String modTimeDiff(int day1, int hour1, int min1, 
	int sec1, int day2, int hour2, int min2, int sec2) {
		String modTimeDiffs = "";
		long timestamp1 = 60*60*24*day1 + 60*60*hour1 + 60*min1 + sec1;
		long timestamp2 = 60*60*24*day2 + 60*60*hour2 + 60*min2 + sec2;
		long difference = (timestamp1 < timestamp2) 
		? (timestamp2-timestamp1) : (timestamp1-timestamp2);
		modTimeDiffs+=("("+(difference/(60*60*24))+" ");
		difference%=(60*60*24);
		modTimeDiffs+=((difference/(60*60))+ " ");
		difference%=(60*60);
		modTimeDiffs+=((difference/60)+" ");
		difference%=(60);
		modTimeDiffs+=((difference)+") ");
		return modTimeDiffs;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		
		int day1, hour1, min1, sec1,
		day2, hour2, min2, sec2;
		
		for (int i=0; i<size; i++) {
			day1 = in.nextInt(); hour1 = in.nextInt(); 
			min1 = in.nextInt(); sec1 = in.nextInt();
			day2 = in.nextInt(); hour2 = in.nextInt(); 
			min2 = in.nextInt(); sec2 = in.nextInt();
			
			array[i] = modTimeDiff(day1, hour1, min1, sec1, 
			day2, hour2, min2, sec2);
			
		}
		
		for (int i=0; i<size; i++) {
			System.out.print(array[i]);
		}
		
	}
	
}

// multiply mins by 60, hours by 60^2, and sum up. (1st task)
//

// suppose we are given two timestamps:
// start: May 3, 17:08:30
// end  : May 8, 12:54:15
// we'd like to know how much time (in d/h/m/s) is spent travelling.

// task: convert both timestamps to big numbers, representing seconds
// from the beginning of the month (or year, or century). calculate the
// difference, then convert this back into (d/h/m/s).
// we will be given several pairs of timestamps. we suppose that both
// dates in the pair are always in the same month, s.t. only the day
// is given. we calculate the difference btwn timestamps in each pair.

/* input data:
3
1 0 0 0 2 3 4 5
5 3 23 22 24 4 20 45
8 4 6 47 9 11 51 13

answer:
(1 3 4 5) (19 0 57 23) (1 7 44 26) */