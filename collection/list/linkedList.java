import java.util.LinkedList;

class linkedListExample {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();

		//	to add element at the beginning
		names.addFirst("Karan");
		System.out.println(names);

		names.addLast("Nik");
		System.out.println(names);

		names.addFirst("Sudi");
		System.out.println(names);

		System.out.println("To get first element:\t"+names.getFirst());
		System.out.println("To get last element:\t"+names.getLast());

		System.out.println("All elements in LinkedList:");
		for(int i=0; i<names.size(); i++) {
			System.out.println("->"+names.get(i));
		}

		//	to remove elements:
		//	names.removeFirst();
		//	names.removeLast();

		for(int i=0; i<names.size(); i++) {
			System.out.println("Removed:\t"+names.getFirst());
			names.removeFirst();
		}

		System.out.println(names);
	}
}

/*
NOTE
====

->	if you use removeFirst() to remove all the elements via loop or something, 
	then it will remove elements from beginning till second-last but will not remove the last element!
->	same happens with removeLast() method.
*/

/*
OUTPUT
======

% javac linkedList.java
% java linkedListExample

[Karan]
[Karan, Nik]
[Sudi, Karan, Nik]
To get first element:	Sudi
To get last element:	Nik
All elements in LinkedList:
->Sudi
->Karan
->Nik
Removed:	Sudi
Removed:	Karan
[Nik]
*/