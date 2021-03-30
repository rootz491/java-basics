import java.util.*;

class Student {
	int rollNo;
	String name;
	char grade;

	Student(int rollNo, String name, char grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
}

class practice {
	public static void main(String[] args) {
		//	create some objects of Student type
		Student s1 = new Student(1, "Karan Sharma", 'F');
		Student s2 = new Student(2, "Nihil Swain", 'C');
		Student s3 = new Student(3, "Sudhanshu Rajdhur", 'B');

		//	create a List of Student objects
		List<Student> student = new ArrayList();

		//	add student obj to the list
		Collections.addAll(student, s1, s2, s3);

		//	iterate over the list
		System.out.println("\nLIST");
		Iterator<Student> itr = student.iterator();
		while(itr.hasNext()) {
			//	next() will return obejct and that can be stored in temprory object then access it's variables.
			Student st = (Student)itr.next();
			System.out.println("\nName: "+st.name+"\nRoll no.: "+st.rollNo+"\nGrade:"+st.grade);
		}

		//	reverse iterator (ListIterator)
		System.out.println("\nREVERSE LIST");
		ListIterator<Student> ritr = student.listIterator(student.size());
		while(ritr.hasPrevious()) {
			Student rst = (Student)ritr.previous();
			System.out.println("\nName: "+rst.name+"\nRoll no.: "+rst.rollNo+"\nGrade:"+rst.grade);
		}
	}
}