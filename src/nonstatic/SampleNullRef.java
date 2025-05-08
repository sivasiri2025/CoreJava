package nonstatic;

public class SampleNullRef {
	
	static {
		System.out.println("In static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main method");
		
		System.out.println("Before the null reference variable");
		
		ExamplNulRef e1 = null;
		
		System.out.println("after the null referenced variable");
		
		int c = e1.m1();
		
		ExamplNulRef.m2();
		
		System.out.println("after method execution "+c);
	}

}
