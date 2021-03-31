interface Animal {
	//	interface - method doesn't have body
	public void eat();
	public void sleep();
}


class cow implements Animal {
	cow() {
		System.out.println("me:	cow");
	}
	//	giving body to methods in subclass
	@Override
	public void eat() {
		System.out.println("eat:	grass");
	}
	public void sleep() {
		System.out.println("sleep:	zZz");
	}
}


class abstractInterface {
	public static void main(String[] args) {
		cow ob = new cow();
		ob.eat();
		ob.sleep();
	}


/*
OUTPUT
======

% javac abstractInterface.java
% java abstractInterface

me:	cow
eat:	grass
sleep:	zZz
*/