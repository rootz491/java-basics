import java.lang.Integer;

class typeExperiment {
	public static void main(String[] args) {
		Integer num = new Integer(40);
		Integer num2 = 60;

		//	to get value out of it!
		System.out.println(num);
		System.out.println("float value:\t" + num.floatValue());
		System.out.println("int value:\t" + num.intValue());
		//	to parse/get value out of String
		System.out.println(Integer.parseInt("69"));
		//	decode method -> string to Ingteger
		System.out.println(Integer.decode("123"));
		System.out.println(num.toString());
	
		System.out.println("\nsecond number: " + num2);
		//	comparing two objects
		System.out.println(num.compareTo(num2) + "\t-> false");
		int temp = num2;
		num2 = num;
		System.out.println(num.compareTo(num2) + "\t-> true");

		//	here function needed the Object type arg to compare with, But i've passed
		//	primitive datatype, now complier will `box` primitive type into Object type!
		//	this is called boxing.
		//	(unboxing is vise-versa)
		System.out.println(num.compareTo(temp));

		//	equals method - only compare value
		//	doesn't care if passed arg is Object or primitive variable
		System.out.println(num.equals(num2));
		int temp2 = num;
		System.out.println(num.equals(temp2));
	
		System.out.format("Integer value: %d%n", num);

	}
}

/*
OUTPUT
======

% javac typeExperiment.java
% java typeExperiment
40
float value:	40.0
int value:	40
69
123
40

second number: 60
-1	-> false
0	-> true
-1
true
true
Integer value: 40
*/

