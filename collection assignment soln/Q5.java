import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.ListIterator;
import java.lang.Math;

class Q5 {
	public static void main(String[] args) {
		Map<Integer, Integer> initial = new HashMap<Integer, Integer>();

		//	make a map of 5 random pairs
		for(int i=0; i<5; i++)
			initial.put((int)(Math.random()*100), (int)(Math.random()*100)/2);

		System.out.println("unsorted ->\t" + initial);

		//	get list of keys
		ArrayList<Integer> temp = new ArrayList<Integer>(initial.keySet());

		Collections.sort(temp);
		System.out.println("sorted map%n");

		ListIterator itr = temp.listIterator();
		while(itr.hasNext()) {
			int item = (int)itr.next();
			System.out.printf("%d -> %d\n", item, initial.get(item));
		}
	}
}

/*
OUTPUT
======
% javac Q5.java
% java Q5
unsorted ->	{70=26, 71=1, 23=46, 25=7, 46=3}
sorted map
23 -> 46
25 -> 7
46 -> 3
70 -> 26
71 -> 1
*/