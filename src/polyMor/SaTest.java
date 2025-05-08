package polyMor;

public class SaTest extends ExTest{
	
	 void add(int a, int b) { // Overriding method
		System.out.println("SaTest add method a+b="+(a+b));
	}
	

	public static void main(String[] args) {
		SaTest s = new SaTest();
		s.add(10, 20);
		s.sub(10, 20);
	}

}
