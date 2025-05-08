package nonstatic;

public class NSExampleM {
	
//	Non static variables
//	Non static blocks
//	Constructors
//	NS methods
//	Main method

	
	int x = m1();
	int m1() {
		System.out.println("NSV x");
		return 10;
	}
	
	{
		System.out.println("NSB 1");
	}
	
	NSExampleM(){
		System.out.println("No arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		NSExampleM ns = new NSExampleM();
		
		System.out.println("x="+ns.x+"y="+ns.y);
	}
	
	
	int y = m2();
	int m2() {
		System.out.println("in m2 method");
		return 20;
	}

	{
		System.out.println("NSB2");
	}
	
}
