import java.util.*;

class vectorExp {
	public static void main(String[] args) {
		Vector<String> exp1 = new Vector<String>();


		System.out.println(exp1.capacity());

		exp1.add("yogesh");
		// System.out.println(exp1);
		exp1.addElement("karan");
		// System.out.println(exp1);

		System.out.println(exp1.capacity());
		//	forEach

		for(String i:exp1) {
			System.out.println(i);
		}
	}
}