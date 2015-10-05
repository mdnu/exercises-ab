import java.util.Scanner;

class ab25_GCD {
	
	public static int gcd(int a, int b) {
		while (a!=0 && b!=0) {
			if (a > b) {
				a%=b;
			} else {
				b%=a;
			}
		}
		int gcd = (a!=0) ? a : b;
		return gcd;
	}
	
	public static int lcm(int a, int b) {
		int gcd_ab = gcd(a,b);
		int c = a*b;
		return c/gcd_ab;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] array = new String[size];
		int a, b;
		
		for (int i=0; i<size; i++) {
			a = in.nextInt(); b = in.nextInt();
			int gcd_result = gcd(a,b);
			int lcm_result = lcm(a, b);
			array[i] = ("("+gcd_result+" "+lcm_result+")");
		}
		
		for (int i=0; i<size; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		}
		
	}
}

/* Recall that for a,b natural numbers, gcd(a,b) = c iff
c|a and c|b and for any d for which d|a and d|b, that d<c.
Euclid's algorithm for the gcd:
1. let c_0 = max(a,b) - min(a,b)
2. let c_1 = min(a,b) - c_0
3. let c_2 = c_0 - c_1
...
compute until c_n > 0 and c_n-1 - c_n < 0.

Recall also that lcm(a,b) = a*b/gcd(a,b)

our task: given two numbers, we form (x,y) which are the gcd
and lcm respectivelu.

sample input/output:
input data:
2
2 3
4 10

answer:
(1 6) (2 20) */