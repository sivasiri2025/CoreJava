package nonstatic;

public class WholeExample {
	
	static {
		System.out.println("IN static block");
	}
	
	static int a = m1();
	static int m1() {
		System.out.println("in m1 method");
		return 10;
	}
	
	{
		System.out.println("NOn static block");
	}
	
	int x = m2();
	int m2() {
		System.out.println("in m2 method");
		return 20;
	}
	
	WholeExample(){
		System.out.println("no arg constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
		WholeExample e1 = new WholeExample();
		System.out.println("After object creation");
		System.out.println("a value="+a + " | x value="+e1.x);
	}

}
