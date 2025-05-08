package abstExample;

public abstract class Example {

	abstract void m1();
	
	static int a = 10;
	int x = 20;
	
	static {
		System.out.println("In Example SB");
	}
	
	{
		System.out.println("In Example NSB");
	}
	
	Example(){
		System.out.println("Zero arg constructor");
	}
	static void m2() {
		System.out.println("In eample m2 static method");
	}
	void m3() {
		System.out.println("Example non static method m3");
	}
	
//	public static void main(String[] args) {
//		Example e = new Example();
//	}
	
}
