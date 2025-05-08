package strHandling;

import java.util.Arrays;

public class CharArraTest {

	// converting string to char array
	// converting string to byte array
	public static void main(String[] args) {
		String s1 = "Java";
		char[] ch1 = s1.toCharArray();
		byte[] b1 = s1.getBytes();

		System.out.println(s1);
		System.out.println("ch1 : " + Arrays.toString(ch1));
		System.out.println("b1 : " + Arrays.toString(b1));

		System.out.println("Value of method string");
		// valueOf --> converting any datatype to string
		int a = 20;
		String val = String.valueOf(a);
		System.out.println(String.valueOf(val));

		// concatination -->
		System.out.println("String concatenation");
		String s2 = "wed";
		String s3 = s2.concat("+thursday");
		System.out.println("concat=" + s3);

		// join with delimeter
		String s4 = String.join("-", "a", "b", "c", "d", "e");
		System.out.println("join delimeter=" + s4);

		// string to uppercase and lowercase
		System.out.println("upper case and lower case");
		String s5 = "oops concept";
		System.out.println(s5.toUpperCase());
		String s6 = "String HANdling";
		System.out.println(s6.toLowerCase());

		// String replace method
		System.out.println("Replace method");
		String s7 = "abc abc abc";
		String s7Repla = s7.replace('a', 'b');
		System.out.println("Replace =" + s7Repla);

		// String trim method
		System.out.println("Trim method");
		String s8 = " bac ";
		System.out.println("trim=" + s8.trim());
		System.out.println("stripLeading=" + s8.stripLeading());
		System.out.println("stripTrailing=" + s8.stripTrailing());

		System.out.println("Intern method");
		String s9 = "Java";
		String s10 = s9.intern();
		System.out.println(s9 == s10);

		String s11 = new String("PA");
		String s12 = s11.intern();
		System.out.println(s11 == s12);
	}

	static int m1() {
		return 10;

	}

}
