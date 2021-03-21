import java.util.*;

class maxmin {
	public static void main(String args[]) {
		//System.in is a standard input stream
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = sc.nextInt();
		System.out.println("Enter second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter third Number: ");
		int c = sc.nextInt();

		int max=a, min=a;

		//	find max:
		if(max>b)
			max=b;
		if(max>c)
			max=c;

		//	find min:
		if(min<b)
			min=c;
		if(min<c)
			min=c;

		System.out.printf("\n\nmax: %d\nmin: %d", max, min);

	}
}