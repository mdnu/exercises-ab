import java.util.Scanner;

class ab27_LinearFunction {
	
	private static int x1,y1,x2,y2,a,b;
	
	public int getA(int x1, int y1, int x2, int y2) {
		return (y1-y2)/(x1-x2);
	}
	
	public int getB(int a, int y1, int x1) {
		return (y1 -(a*x1));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size =in.nextInt();
		int[][] array = new int[size][size];
		
		ab27_LinearFunction im = new ab27_LinearFunction();
		for (int i=0; i<size; i++) {
			x1=in.nextInt(); y1=in.nextInt();
			x2=in.nextInt(); y2=in.nextInt();
			
			int a = im.getA(x1,y1,x2,y2);
			int b = im.getB(a,y1,x1);
			array[i][0]=a;
			array[i][1]=b;
		}
		
		for (int i=0; i<size; i++) {
			System.out.print("("+array[i][0]+" "+array[i][1]+")");
			if (i<size-1) {
				System.out.print(" ");
			}
		}
	
	}
	
}

/* we know that the standard linear equation is of the form
y=ax+b (usually a is m, in either case, it's the slope, while b
is the y-intercept).
for example: (a,b)=(3,2) will yield y-values y=2,5,8,11... for x=0,1,2,3...

task: determine a,b by two points, belonging to the function.
we are given two pairs of values (x1,y1),(x2,y2) and we must find the function's
values for (a,b).

sample input/output:
input data:
2
0 0 1 1
1 0 0 1

answer:
(1 0) (-1 1) */