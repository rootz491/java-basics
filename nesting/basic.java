public class basic {
    private static int count = 0;

    public String name;
    public int id;
    private int age;
    private Student education;

    public basic() {
        this("Anonymous", 00);
    }

    public basic(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++count;
   }

   void createStudy(String university, int rollNo) {
	education = this.new Student(university, rollNo);
   }

    void whoami() {
        System.out.println(this.name);
	if(education != null) {
		education.data();
	}
    }

    class Student {
        private String university;
        public int rollNo;

        public Student(String university, int rollNo) {
            this.rollNo = rollNo;
            this.university = university;
        }

        public Student() {
            this("Anonymous", 00);
        }

	void data() {
		System.out.println("university: "+university);
		System.out.println("Roll no.: "+rollNo);
	}
    }

    public static void main(String[] arg) {
        basic me = new basic("karan", 18);

	me.createStudy("Graphic Era University", 2101787);
        me.whoami();
    }
}
