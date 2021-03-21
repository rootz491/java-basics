import java.lang.Integer;

class sumOfDigitUntillSingleDigit {
	public static void main(String[] arg) {
		int sum = 0;
		for(int i=0; i<arg.length; i++)
			sum += Integer.parseInt(arg[i]);

		while(!isSingleDigit(sum)) {
			int newSum = 0;
			while(sum!=0) {
				newSum += sum%10;
				sum /= 10;
			}
			sum = newSum;
		}
		System.out.println("sum = "+sum);
	}

	static boolean isSingleDigit(int num) {
		if(num/10==0)
			return true;
		return false;
	}
}

/*
OUTPUT
======


% javac sumOfDigitUntillSingleDigit.java
% java sumOfDigitUntillSingleDigit 9 -1 2 3 4

sum = 8

*/