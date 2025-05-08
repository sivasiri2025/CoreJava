package strHandling;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String();

		//1. Empty
		System.out.println(s1.isEmpty());
		
		if(!s1.isBlank()) {
			System.out.println("obejct is not blank");
		}
		
		//2. length
		
		String s2 = "Java Traning";
		//string is 9 cusip, 7 sedol, 12 isin --> security names

		System.out.println("lenght of string="+ s2.length());
		
		String s3 = getSecurity();
		if(s3.length() == 12) {
			System.out.println("security is isin");
		}
		
		//3. hashcode
		System.out.println("hashcode "+ s3.hashCode());
		
		//4. toString
		System.out.println("to string="+ s3.toString());
		System.out.println("to string s3="+ s3);
		
		//5. Equals
		System.out.println("String equals method");
		String s4 = "a";
		String s5 = "a";
		String s6 = new String("a");
		String s7 = new String("a");
		
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		
		System.out.println("String equalsIgnore case method");
		
		String s8 = "b";
		String s9 = "B";
		
		System.out.println(s8.equals(s9));
		System.out.println(s8.equalsIgnoreCase(s9));
		
		System.out.println("String equalsIgnore case method");
		
		String s10 = "abc";
		String s11 = "a";
		String s12 = "ABC";
		
		System.out.println(s10.compareTo(s11));
		System.out.println(s10.compareTo(s12));
		

	}
	
	public static String getSecurity(){
		return "abcdefgh1234";
	}

}
