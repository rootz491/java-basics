import java.util.*;

class avgOf2DarrayRow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no. of rows for 2D array: ");
		int row = scanner.nextInt();
		//	array with certain row and uncertain cols.
		int[][] arr = new int[row][];
		//	input the values into array
		for(int i=0; i<row; i++) {
			System.out.println("enter no. of elements in "+(i+1)+" row: ");
			int col = scanner.nextInt();
			arr[i] = new int[col];		//	allocate space for each row seperately.
			System.out.println("enter the values for "+(i+1)+" row: ");
			for(int j=0; j<col; j++) {
				System.out.printf("[%d][%d] -> ", (i+1), (j+1));
				arr[i][j] = scanner.nextInt();
			}
		}
		//	print aavg of each row:
		for(int i=0; i<row; i++) {
			int sum = 0, j;
			for(j=0; j<arr[i].length; j++)
				sum += arr[i][j];
			int avg = sum/j;
			System.out.println("avg of "+(i+1)+" row: "+avg);
		}
	}
}

/*
OUTPUT
======

% javac avgOf2DarrayRow.java
% java avgOf2DarrayRow      

enter no. of rows for 2D array: 
3
enter no. of elements in 1 row: 
3
enter the values for 1 row: 
[1][1] -> 2
[1][2] -> 3
[1][3] -> 4
enter no. of elements in 2 row: 
2
enter the values for 2 row: 
[2][1] -> 1
[2][2] -> 1
enter no. of elements in 3 row: 
5
enter the values for 3 row: 
[3][1] -> 1
[3][2] -> 2
[3][3] -> 3
[3][4] -> 4
[3][5] -> 5

avg of 1 row: 3
avg of 2 row: 1
avg of 3 row: 3


*/

