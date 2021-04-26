import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.Math;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.Math;


class Q6 {

	public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> init) {
		List<Integer> initVal = new LinkedList<Integer>(init.values());
		Map<Integer, Integer> sorted = new LinkedHashMap<Integer, Integer>();	//	LinkedHashMap maintains insertion order

		Collections.sort(initVal);			//	sort list of VALUES

		for(Integer val : initVal)							//	iterate over sorted list of VALUES
			for(Integer key : init.keySet())				//	iterate over list of KEYS forEach VALUE
				if(val.equals(init.get(key))) {					//	if key of current value will occur
					if(sorted.containsKey(key))						//	if duplicates duplate will occur
						continue;										//	then pass
					sorted.put(key, val);							//	else, push data into SORTED map
					break;											//	break inner loop
				}

		return sorted;
	}


	public static void main(String[] args) {
		Map<Integer, Integer> initial = new HashMap<Integer, Integer>();

		//	add 5 random pairs to map
		for(int i=0; i<5; i++)
			initial.put((int)(Math.random()*100), (int)(Math.random()*100)/2);
		//	add 3 random keys with same values to map
		for(int i=0; i<3; i++)
			initial.put((int)(Math.random()*100), 5);

		System.out.println("unsorted ->\t" + initial);

		Map<Integer, Integer> sorted = sortByValue(initial);

		System.out.println("sorted ->\t" + sorted);
	}
}

/*
OUTPUT
======

% javac Q6.java
% java Q6      
unsorted ->	{87=30, 50=20, 0=37, 43=3, 13=32, 93=5, 84=5, 39=5}
sorted ->	{43=3, 93=5, 84=5, 39=5, 50=20, 87=30, 13=32, 0=37}
*/
