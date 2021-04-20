import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import java.lang.Math;

//	NOT CORRECT ! ! !
class Q6 {

	public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> init, boolean order) {
		List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(init.entrySet());

		//	sorting list based on values
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> ob1, Entry<Integer, Integer> ob2) {
				if(order)
					return ob1.getValue().compareTo(ob2.getValue());
				else
					return ob1.getValue().compareTo(ob1.getValue());
			}
		});

		Map<Integer, Integer> sorted = new HashMap<Integer, Integer>();
		for(Entry<Integer, Integer> i : list) {
			sorted.put(i.getKey(), i.getValue());
		}

		return sorted;
	}


	public static void main(String[] args) {
		Map<Integer, Integer> initial = new HashMap<Integer, Integer>();
		boolean ASC = true;

		//	make a map of 5 random pairs
		for(int i=0; i<5; i++)
			initial.put((int)(Math.random()*100), (int)(Math.random()*100)/2);

		System.out.println("unsorted ->\t" + initial);

		Map<Integer, Integer> sorted = sortByValue(initial, ASC);

		System.out.println("sorted ->\t" + sorted);
	}
}