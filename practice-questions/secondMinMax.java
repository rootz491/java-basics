import java.util.*;

class secondMinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int s = scanner.nextInt();
		int[] a = new int[s];

		System.out.println("enter array: ");
		for (int i=0; i<s; i++) {
			System.out.println("element "+(i+1)+": ");
			a[i]=scanner.nextInt();
		}

		int max=a[0];
		int min=a[0];

		System.out.printf("array");
		for (int i=0; i<s; i++) {
			//	max
			if(a[i]>max)
				max = a[i];
			//	min
			if(a[i]<min)
				min = a[i];
			System.out.printf(" -> "+a[i]);
		}

		int smin = 100000;
		int smax = -100000;

		for (int i=0; i<s; i++) {
			//	second max
			if(a[i]>smax && a[i]<max)
				smax = a[i];
			//	second min
			if(a[i]<smin && a[i]>min) {
				smin = a[i];
			}
		}

		System.out.println();
		System.out.println("second max -> "+smax);
		System.out.println("second min -> "+smin);

	}
}


/*
OUTPUT
======

% javac secondMinMax.java
% java secondMinMax      

enter size of array: 
10
enter array: 
element 1: 
65
element 2: 
23
element 3: 
66
element 4: 
98
element 5: 
74
element 6: 
23
element 7: 
46
element 8: 
23
element 9: 
87
element 10: 
37

array -> 65 -> 23 -> 66 -> 98 -> 74 -> 23 -> 46 -> 23 -> 87 -> 37

second max -> 87
second min -> 37


*/
