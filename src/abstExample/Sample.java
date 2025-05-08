package abstExample;

public class Sample extends Example{
	
	static int b = 30;
	int y = 40;
	
	static {
		System.out.println("Sample SB");
	}
	
	{
		System.out.println("Non static block");
	}
	
	Sample(){
		System.out.println("Sample 0 arg constructor");
	}
	
	static void m4() {
		System.out.println("Sample Static method");
	}
	
	void m5() {
		System.out.println("Sample Non static method");
	}

	@Override
	void m1() {
		System.out.println("m1 in Sample class");
		//TODO: all the business
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main method sample class");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		m2();
		m4();
		System.out.println();
		
		Sample s = new Sample();
		s.m1();
		s.m3();
		s.m5();
	}
}
