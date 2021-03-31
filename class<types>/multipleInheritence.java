//	first interface
interface Creature {
	String whoami();
}
//	second interface
interface Human extends Creature {
	String getName();
}

/*
Here either you can IMPLEMENT 2 interfaces into the class like we've done here
->		class Employee implements Human, Creature {}

		OR

you can EXTEND one interface into another and then IMPLEMENT exteded interface with class.
->		interface Human extends Creature {}
*/

class Employee implements Human {
	public String name;
	//	constructor
	Employee(String name) {
		this.name = name;
	}
	//	providing body for interface methods
	public String whoami() {
		return "Human";
	}
	public String getName() {
		return "Mr. "+name;
	}
	void identification() {
		System.out.println("\tEmployee");
		//	here we are calling methods of those interfaces
		System.out.println("whoami:\t"+this.whoami());
		System.out.println("name:\t"+this.getName());
	}
}

class multipleInheritence {
	public static void main(String[] args) {
		Employee ob = new Employee("Karan Sharma");
		ob.identification();
	}
}




/*
OUTPUT
======

% javac multipleInheritence.java
% java multipleInheritence      
	Employee
whoami:	Human
name:	Mr. Karan Sharma
*/

