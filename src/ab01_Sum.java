/**
 * http://www.codeabbey.com/index/task_view/sum-of-two
 * We need to sum two numbers and tell the result. 
 * Though you can do it manually, try to write a simple program in any language you know, 
 * or like, or want to learn.
 * input data:
 * 3 5
 * answer:
 * 8
 */

import java.util.Scanner;

public class ab01_Sum {
	public static int sum(int a, int b){
		return a + b;
	}
	
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a, b;
		
		System.out.println("input data:");
		a = in.nextInt(); b = in.nextInt();
		System.out.println(sum(a, b));
	}
}
