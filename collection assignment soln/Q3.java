import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

class Q3 {
	public static void main(String[] args) {
		List<String> current = new ArrayList<String>();
		HashSet<String> prev = new HashSet<String>();

		Collections.addAll(current, "Java", "DBMS", "OS", "Microprocessor", "Career Skills", "Software management");

		Collections.addAll(prev, "Python", "Manangement", "Networking", "computer Architecture");

		//	add current sem subjects to previous sem subjects
		prev.addAll(current);

		//	listIterator can only traverse through List-type object, but not set-type object.
		Iterator itr = prev.iterator();
		while(itr.hasNext())
			System.out.format("%s%n",itr.next());
	}
}
/*
OUTPUT
======
% javac Q3.java
% java Q3
computer Architecture
Java
Networking
OS
Career Skills
Software management
Manangement
DBMS
Microprocessor
Python
*/