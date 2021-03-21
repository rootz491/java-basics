import java.util.*;
import java.lang.Math;

class sumOfSeries {
	public static void main(String[] args) {
		int x, y, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value of x & y: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("enter number (n): ");
		n = scanner.nextInt();
		float sum = 0;

		for(int i=1; i<n; i+=2) {
			sum += (Math.pow(x,i))/(Math.pow(y,i+1));
		}

		System.out.println("sum of series: "+sum);
	}
}

/*
OUTPUT
======

% javac sumOfSeries.java
% java sumOfSeries

enter value of x & y: 
4    
5
enter number (n): 
10
sum of series: 0.39672258

*/