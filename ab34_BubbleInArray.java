import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class ab34_BubbleInArray {
	
	public static int swap = 0;
	public static int size = 0;
	public static long result = 0;
	public static List<Integer> array = new ArrayList<Integer>();
	
	private static void swap(List<Integer> array, int i, int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
	
	public static void bubbleSort(List<Integer> array, int size) {
		boolean continueSort = true;
			
		for (int i=0; i<size; i++) {
			if (array.get(i) > array.get(i+1)) {
				swap(array, i, i+1);
				swap++;
			}
		}
	}
	
	public static long checkSumProduct(long result) {
		long newResult = (113*result)%10000007;
		return newResult;
	}
	
	public static long checkSum(List<Integer> array) {
		for (int i=0; i<size+1; i++) {
			result += array.get(i);
			result = checkSumProduct(result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while (check) {
			int number = in.nextInt();
			if (number != -1) {
				array.add(number);
			} else {
				size = array.size()-1;
				break;
			}
		}
		
		bubbleSort(array, size);
		long checkSumResult = checkSum(array);
		System.out.println(swap+" "+checkSumResult);
	}
}
