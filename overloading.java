class overloading {
	int a, b;
	float c, d;

	void getValue(int a, int b) {
		this.a=a;
		this.b=b;
	}

	void getValue(float a, float b) {
                 this.c=a;
                 this.d=b;
         }


	void add() {
		System.out.println(this.a+this.b);
	}
}


class overload {
	public static void main(String[] arg) {
                 overloading ob = new overloading();

		int a = 7;
		int b = 10;

                 ob.getValue(a, b);
 
                 ob.add();
         }
	
}









