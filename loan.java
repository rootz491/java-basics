class loan {
	public static void main(String[] arg) {
		int loanAmount = 20000;
		int month = 1;

		while (month <= 6) {
			loanAmount -= (loanAmount / 100) * 10;
			System.out.println("month "+month+":\n"+"remaining amount: "+loanAmount);
			month++;
		}
		
	}
}
























