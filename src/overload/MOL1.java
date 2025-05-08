package overload;

public class MOL1 {
	
	//If the given argument type parameter is not found then the compiler searches for a widening type of the given argument. 

	static void m1(int a) {
		System.out.println("int - arg");
	}
	
	static void m1(float f) {
		System.out.println("float -arg");
	}
	
	static int test(String s) {
		System.out.println("String="+ s);
		return 10;
	}
	
	void test2(int a) {
		System.out.println("test 2"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOL1 mol = new MOL1();
		
		m1(10);
		m1('a');
		
		m1(50L);
		
		long L = 50;
		m1(L);
		
		String s = "Java Training";
		int c = test(s); //method name
		
		mol.test2(20);

	}

}
