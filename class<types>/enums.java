//	enum constants are public, static and final
enum Level {
	LOW,
	MEDIUM,
	HIGH
}

class Enums {
	public static void main(String[] args) {
		Level var = Level.HIGH;
		System.out.println("Current Level:\t"+var);

		//	switch case for enums
		switch(var) {
			case LOW:
				System.out.println("Level is LOW for now");
				break;
			case MEDIUM:
				System.out.println("Level is MEDIUM for now");
				break;
			case HIGH:
				System.out.println("Level is HIGH for now");
				break;
			default:
				System.out.println("Can't figure out for now 😅");
		}

		//	loop over enums
		System.out.println("Loop over enum values:");
		for(Level i:Level.values())
			System.out.println(i);
	}
}

/*
OUTPUT
======
% javac enums.java
% java Enums

Current Level:	HIGH
Level is HIGH for now
Loop over enum values:
LOW
MEDIUM
HIGH
*/