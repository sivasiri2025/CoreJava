package strHandling;

import java.util.Arrays;

public class StringBf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("a");
		String s2 = new String("a");
		StringBuffer sb1 = new StringBuffer("a");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println(s1.contentEquals(s2));
		System.out.println();
		
		System.out.println(s1.equals(sb1));
		System.out.println(s1.contentEquals(sb1));
		//System.out.println(sb1.contentEquals(s1));
		
		System.out.println("CharAt method string");
		//charAt
		String s3 = "abcdef";
		System.out.println(s3.charAt(1));
		System.out.println(s3.charAt(0));
		//System.out.println(s3.charAt(-1));
		
		//indexOf
		System.out.println("indexOf method string");
		String s4 = "Java Programming language";
		System.out.println(s4.length());
		
		System.out.println(s4.indexOf('a'));
		System.out.println(s4.indexOf('l'));
		
		//contains
		System.out.println("contains method string");
		String s5 = "datazen technologies";
		System.out.println(s5.contains("zen"));
		System.out.println(s5.contains("sei"));
		
		//startwith and endswith
		System.out.println("startwith and endswith");
		String s6 = "abcbbcans";
		System.out.println(s6.startsWith("a"));
		System.out.println(s6.startsWith("m"));
		System.out.println(s6.endsWith("s"));
		
		//substring 
		System.out.println("substring method");
		String s7 = "Java String handling";
		System.out.println(s7.length());
		System.out.println(s7.substring(6));
		//System.out.println(s7.substring(21));
		System.out.println(s7.substring(0, 5));
		
		//split method
		System.out.println("Split method String");
		String email = "xxxxx@abc.com";
		String s8 ="java";
		String[] s8Arr = s8.split("");
		System.out.println(Arrays.toString(s8Arr));
		String s9 = "Java | Languaage";
		String[] s9Arr = s9.split("'|'");
		System.out.println(Arrays.toString(s9Arr));
		System.out.println(s9Arr.length);
		
		String s10 = "abc&txt";
		String[] s10Arr = s10.split("&");//
		System.out.println("s10Arr Length="+s10Arr.length);
		String firstStr = s10Arr[0];
		String secondStr = s10Arr[1];
		System.out.println(firstStr +" = "+secondStr);
		
		String s11 = "abc,mno";
		String[] s11Arr = s11.split(",");
		System.out.println(s11Arr.length);
		
		
		
		
		
		
				
		
	}

}
