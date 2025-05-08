package staticFlow;

public class ExampleStaticOne {
	
	static int a = m1();
	int b = 20;
	
	static int m1() {
		System.out.println("SV : a");
		return 10;
	}
	
	static {
		System.out.println("SB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mian method");
		System.out.println("a value="+a);
	}

}
