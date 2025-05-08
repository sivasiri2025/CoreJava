package polyMor;

public class Sample extends Example{
	
	static void m1() {
		System.out.println("sample m1");
	}
	
	void m2() {
		System.out.println("Sample m2");
	}
	
	void m3(String s) {
		System.out.println("Sample m3 method "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.m1();
		s.m2();
		s.m3();
		s.m3("DZT");
		
		Example e = new Sample();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		//e.m3("Example object");
		
		

	}

}
