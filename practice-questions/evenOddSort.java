import java.util.*;

class evenOddSort {
	public static void main(String[] args) {
		System.out.println("enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("enter elements:");
		for(int i=0; i<s; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("original array: ");
		for(int i:arr) {
			System.out.println(i);
		}

		//	push even to first
		for(int i=1; i<s; i++) {
			int current = i;
			int j = i-1;
			while(j>0 && arr[j]%2==0) {
				int flag = arr[current];
				arr[current] = arr[j];
				arr[j] = flag;
				current=j;
				j--;
			}
		}

		System.out.println("sorted array: ");
		for(int i:arr) {
			System.out.println(i);
		}
	}
}