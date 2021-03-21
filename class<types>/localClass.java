class localClassExample {
	static String regularExpression = "[^0-9]";
	
	//	simple method
	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
		final int numberLength = 10;

		//	local class
		class PhoneNumber {
			String formattedNumber = null;
			PhoneNumber(String phoneNumber) {
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if (currentNumber.length() == numberLength)
					formattedNumber = currentNumber;
				else
					formattedNumber = null;
			}

			public String getNumber() {
				return formattedNumber;
			}
		
			//	accessing variables of outer class directly 
			/*
			public void printOriginalNumbers() {
				System.out.println("Original numbers are ", phoneNumber1 + " and " + phoneNumber2);
			}
			*/
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First Number is invalid");
		else
			System.out.println("First Number is " + myNumber1.getNumber());

		if (myNumber2.getNumber() == null)
			System.out.println("Second Number is invalid");
		else
			System.out.println("Second Number is " + myNumber2.getNumber());
	}

	//	main method
	public static void main(String[] args) {
		validatePhoneNumber("865-004-8301", "639-752-3249-karan");
	}
}
