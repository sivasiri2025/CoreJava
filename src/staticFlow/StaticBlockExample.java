package staticFlow;

public class StaticBlockExample {
	
	static {
		System.out.println("Static Block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}

	static {
		System.out.println("Static Block 2");
	}
}
