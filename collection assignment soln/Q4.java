import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Q4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int replacement = 53, index = 4;

		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		//	original list
		System.out.printf("Original: ");
		System.out.println(list);

		System.out.printf("new: \t");
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			if (itr.nextIndex() == index)
				list.set(index, replacement);
			System.out.format("%d ", itr.next());
		}
	}
}
/*
OUTPUT
======
% javac Q4.java
% java Q4
Original: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
new: 	1 2 3 4 53 6 7 8 9 10
*/