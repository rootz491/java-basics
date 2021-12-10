import java.util.Arrays;

class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {11, 4, 43, 54, 123, 542, 1, 12, 76, 49, 68, 33};
		int key = 49;
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, key);

		if (index < 0) {
			System.out.println("key not found in given array");
		}
		else {
			System.out.println("Key is found at index: " + index);
		}
	}
}