import java.util.*;

class stringToInitial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String lastName = new String();
		char[] initial = new char[10];
		int start = 0, end = 0, init=0;

		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				end = i;
				initial[init++]=str.charAt(start);
				start = i+1;
			}

			if(i==str.length()-1) {
				lastName = str.substring(start, i+1);
			}
		}

		int i=0;
		while(i<init) {
			System.out.printf("%c. ", initial[i]);
			i++;
		}
		System.out.println(lastName); 
	}
}

/*
OUTPUT
======

% javac stringToInitial.java
% java stringToInitial      

Ramesh kumar Sharma
R. k. Sharma

*/