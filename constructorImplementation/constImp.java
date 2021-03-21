public class constImp  {
	public int age;
	public double height;
	public String name;
	static int obCount = 0;

	constImp(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		obCount++;
	}

	void showData() {
		System.out.println("name: "+this.name);
		System.out.println("age: "+this.age);
		System.out.println("height: "+this.height);
	}

	// arbitary number of arguments
	public static void showAllData(constImp... obj) {
		int l = obj.length;
		for(int i=0; i<l; i++) {
			System.out.println("name: "+obj[i].name);
			System.out.println("age: "+obj[i].age);
			System.out.println("height: "+obj[i].height);
		}
	}
}

  
