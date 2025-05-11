package expHandling;

public class ExaThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(m1());
	}
	
	static int m1() {
		try {
			System.out.println("In try");
			//return 10;
		}catch(Exception e) {
			System.out.println("In catch block");
		}finally {
			System.out.println("in finally");
		}
		
		System.out.println("after try/finally");
		return 20;
	}

}
