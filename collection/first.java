import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class first {
	public static void main(String[] args) {
		//	create list
		List<String> ob1 = new ArrayList();

		ob1.add("Nik");
		ob1.add("Sudi");

		System.out.println(ob1 +" \nsize: "+ob1.size());

		//	call method using Collection class, and add elements to ob1 
		Collections.addAll(ob1, "Aditya", "Raushan", "Karan");

		System.out.println(ob1);

		//	sencond list
		List<String> ob2 = new ArrayList();

		ob2.add("Apurb");

		//	invoke from ob1 and add all elements of ob2 to ob1
		ob1.addAll(ob2);

		System.out.println(ob1);




		//	SEARCH on the list

		int sudiIndex = Collections.binarySearch(ob1, "Raushan");	//	will return index for value "sudi"
		System.out.println("index of 'sudi' = "+sudiIndex);





		//	to SORT the list.

		Collections.sort(ob1);

		System.out.printf("Sorted collection: ");

		//	itetrable object

		Iterator<String> itr = ob1.iterator();

		while(itr.hasNext())
			System.out.printf("%s\t", itr.next());
		System.out.println();





		//	sort in REVERSE order

		Collections.sort(ob1, Collections.reverseOrder());
		System.out.printf("reverse sorted collection:\t");

		//	itetrable object
		Iterator<String> itr1 = ob1.iterator();
		while(itr1.hasNext())
			System.out.printf("%s\t", itr1.next());
		System.out.println();




		//	to COPY the list from ob1 to ob2

		Collections.copy(ob1, ob2);

		System.out.println("ob1: " + ob1);	//	it overwrite the old elements and wont affect the size of destinationa array.
	}
}