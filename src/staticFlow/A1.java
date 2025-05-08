package staticFlow;

public class A1 {
	
	static int a = m1();
	static int m1() {
		System.out.println("A1 Static variable");
		return 20;
	}
	
	static {
		System.out.println("A static block");
	}
	
	public static void main(String[] args) {
		System.out.println("A1 main method");
	}

}
