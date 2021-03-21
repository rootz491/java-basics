import java.util.*;
import java.lang.*;

class sumOfNumOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			
		System.out.printf("enter size of array: ");
		int n = scanner.nextInt();
		scanner.nextLine();	//	consumes '\n' character
		String[] list = new String[n];
		//	input the strings
		for(int i=0; i<list.length; i++) {
			System.out.println("enter "+(i+1)+" string: ");
			list[i] = scanner.nextLine();
		}
		//	sum of numeric
		int sum = 0;
		for(int i=0; i<list.length; i++) {
			int j=0;
			while(j<list[i].length()) {
				if((int)list[i].charAt(j)>=49 && (int)list[i].charAt(j)<=57) {gd
					sum += Character.getNumericValue(list[i].charAt(j));
				}
				j++;
			}
		}

		System.out.println("\nsum = "+sum);
	}	
}

/*
OUTPUT
======

% javac sumOfNumOfArray.java
% java sumOfNumOfArray

enter size of array: 4
enter 1 string: 
karan123
enter 2 string: 
kar111
enter 3 string: 
ko5
enter 4 string: 
karan

sum = 14
*/