import java.util.HashMap;

class hashMapExample {
	public static void main(String[] args) {
		//	create a hashMap of people with their age
		HashMap<String, Integer> people = new HashMap<String, Integer>();

		//	put() method to store values
		people.put("Karan", 19);
		people.put("Sudi", 19);
		people.put("Nik", 19);
		people.put("Aditya", 20);
		people.put("Raushan", 21);

		//	get() method to get VALUE by passing KEY
		//	keySet() method to get KEY
		for(String i:people.keySet())
			System.out.println(i+"  ->  "+people.get(i));

		System.out.println("only values:");
		for(Integer i:people.values())
			System.out.println(i);

		//	remove() method to remove pair by passing the key as argument
		people.remove("Raushan");
		System.out.println("after removing 'Raushan':\t"+people);
	}
}

/*
OUTPUT
======
% javac hashMap.java
% java hashMapExample
Sudi  ->  19
Nik  ->  19
Raushan  ->  21
Karan  ->  19
Aditya  ->  20
only values:
19
19
21
19
20
after removing 'Raushan':	{Sudi=19, Nik=19, Karan=19, Aditya=20}
*/