import java.util.*;

class sumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];

		System.out.println("enter first array: ");
		for(int i=0; i<size; i++)
			  a[i] = sc.nextInt();

		System.out.println("enter second array: ");
		for(int i=0; i<size; i++)
			  b[i] = sc.nextInt();

		int sum[] = sumOfArray(a, b, size);

		for(int i=0; i<size; i++)
			System.out.printf(" -> "+sum[i]);
	}

	static int[] sumOfArray(int[] a, int[] b, int size) {
		int[] sum = new int[size];
		for(int i=0; i<size; i++) {
			sum[i] = a[i] + b[i];
		}
		return sum;
	}
}



/*
OUTPUT
======
% javac sumOfArray.java
% java sumOfArray     

enter size of array: 
5
enter first array: 
4
3
2
1
0
enter second array: 
9 
7
6
5
4
 -> 13 -> 10 -> 8 -> 6 -> 4
*/