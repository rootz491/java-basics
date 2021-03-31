abstract class Animal {
	//	abstract method (doesn't have a body)
	public abstract void eat();
	//	normal method
	public void sleep() {
    	System.out.println("sleep:	Zzz");
  	}
}

//	subclass (inherited from Animal class)
class cow extends Animal {
	cow() {
		System.out.println("me:	cow");
	}
	//	body of that abstract function is given here
	@Override
	public void eat() {
		System.out.println("eat:	grass");
	}
}



class abstractClass {
	public static void main(String[] args) {
		cow ob = new cow();
		ob.sleep();
		ob.eat();
	}
}

/*
OUTPUT
=====

% javac abstractClass.java
% java abstractClass

me:		cow
sleep:	Zzz
eat:	grass

*/