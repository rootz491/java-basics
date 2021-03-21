import java.util.*;

class vectorExample {
	public static void main(String[] args) {
		Vector<String> vect = new Vector<String>();

		vect.add("karan");
		vect.add("komal");
		vect.add("Hello World");
		vect.add("🥲");
		vect.add("you piece of shit");

		// add element & increase size of vector by one
		vect.addElement("lol");
		vect.addElement("Chao");
	

		// for each loop
		for(String i:vect) {
			System.out.println(i);
		}


		//	size and capacity
		System.out.println("\n\ndefault capacity: 	"+vect.capacity());
		System.out.println("size of vector: 	"+vect.size());


		//	current index of perticular value.
		System.out.println("\n\n\"karan\" is located at	"+vect.indexOf("karan")+" index");

		//	fisrt and last element
		System.out.println("\n\nfirst element:\t"+vect.firstElement());
		System.out.println("last element: \t"+vect.lastElement());

	}
}