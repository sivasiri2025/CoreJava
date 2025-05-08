package strHandling;

public class ExamplStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String();
		
		String s2 = "cad";
		
		//String copy
		String s3 = new String(s2);
		
		//String with direct strign literal
		String s4 = new String("BBC");
		
		//Stirng assignemtn 
		String s5 = s4;
		
		
		System.out.println("S2: "+s2);
		System.out.println("S3 : "+ s3);
		System.out.println("S4 : "+ s4);
		System.out.println(s2 == s3);		
		System.out.println(s4 == s5);
		
	}

}
