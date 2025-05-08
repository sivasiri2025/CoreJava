package staticFlow;

public class ExampleOne {
	
	static int a = m1();
	static int m1() {
		System.out.println(a);
		return 10;
	}
	
	static int b = m2();
	static int m2() {
		System.out.println("Variable b is create");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a :"+a);
		System.out.println("b :"+b);

	}
	
	int m4() {
		System.out.println("In m4 method");
		return 20;
	}

}
