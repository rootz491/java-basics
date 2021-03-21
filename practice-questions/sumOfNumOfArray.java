import java.util.*;
import java.lang.Integer;

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

			}
		}
	}	
}