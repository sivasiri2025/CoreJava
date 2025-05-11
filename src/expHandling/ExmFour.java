package expHandling;

public class ExmFour {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	static int m1() {
		try {
			System.out.println("in try");
			return 10/0;
		}catch(ArithmeticException are) {
			System.out.println("In catch");
			return 20;
		}finally {
			System.out.println("In finally");
			return 30;
		}
	}

}
