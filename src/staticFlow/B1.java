package staticFlow;

public class B1 extends A1{

	static int b = m2();
	
	static int m2() {
		System.out.println("B1 m2 method");
		return 20;
	}
	
	static {
		System.out.println("B1 static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("B1 main method");
		System.out.println("B1 MM a:"+a);
		System.out.println("B1 MM b:"+b);
		m1();
		
	}

}
