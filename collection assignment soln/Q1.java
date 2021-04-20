import java.util.Vector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Q1 {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		Collections.addAll(list, 1, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 4, 4);

		// System.out.println(list);

		//	find each element's frequency & store into hashMap
		for(int i=0; i<list.size(); i++) {
			if(!freq.containsKey(list.get(i))) {
				int num = 0;
				for (int j=0; j<list.size(); j++)
					if(list.get(i) == list.get(j))
						num++;
				freq.put(list.get(i), num);
			}
		}

		for (Map.Entry<Integer, Integer> i : freq.entrySet())
			System.out.format("%d -> %d%n", i.getKey(), i.getValue());

	}
}

/*

OUTPUT
======

% javac Q1.java      
% java Q1      
1 -> 5
2 -> 4
3 -> 3
4 -> 2

*/