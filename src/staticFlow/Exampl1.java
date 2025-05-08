package staticFlow;

public class Exampl1 {
	
	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		a = a;
		System.out.println("Line 11 ="+ a);
		System.out.println("Line 12 ="+Exampl1.a);
	}

}
