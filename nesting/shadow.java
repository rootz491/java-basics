class shadow {
	public int a = 69;

	class inner {
		int a = 1337;
		
		void showMaterial() {
			System.out.println("normal variable: "+this.a);
			System.out.println("same variable from outer scope: "+shadow.this.a);
		}
	}

	public static void main(String... args) {
		shadow ob1 = new shadow();
		shadow.inner ob2 = ob1.new inner();

		ob2.showMaterial();
	}
}


