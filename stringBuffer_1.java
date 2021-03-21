import java.io.*;

class stringBufferEx {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();
		System.out.println(a.capacity());
		System.out.println(a.length());
		//	append text to stringBuffer
		a.append("karansharma");
		/*
			you can append data of any datatype, and it will be added to the last of the string
		*/
		a.append(4911212);
		System.out.println(a);
		System.out.println(a.capacity());
		System.out.println(a.length());
		//	insert at perticular position
		a.insert(0, "K");
		System.out.println(a);

		StringBuffer b = new StringBuffer("KARAN");
		System.out.println(b);
		//	reverse the number.
		b.reverse();
		System.out.println(b);
		b.append(123456789);
		System.out.println(b);
		//	delete a range of index
		b.delete(5, 13);
		System.out.println(b);
		//	delete char ar pertiular index
		b.deleteCharAt(5);
		System.out.println(b);
		//	replace a range of characters
		b.replace(0,3, "karan");
		System.out.println(b);
		System.out.println(b.charAt(0));
	}
}