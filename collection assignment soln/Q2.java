import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

class Q2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> newList = new HashSet<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 10, 10, 20, 1, 20);

		//	original list
		System.out.printf("Original: ");
		System.out.println(list);

		//	add list into set & it'll automatically remove all dups
		newList.addAll(list);

		//	new list
		System.out.printf("new: ");
		System.out.println(newList);
	}
}
/*
OUTPUT
======

% javac Q2.java
% java Q2

Original: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 10, 10, 20, 1, 20]
new: [1, 2, 3, 4, 20, 5, 10]
*/