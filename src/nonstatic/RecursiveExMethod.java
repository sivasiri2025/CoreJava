package nonstatic;

public class RecursiveExMethod {
	
	//StackOverflowError 
	static void m1() {
		System.out.println("m1");
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		m1();

	}

}
