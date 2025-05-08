package expHandling;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("in try");
			System.out.println(10/0);
		}catch(NullPointerException npe) {
			System.out.println("NullPointerException In catch");
		}catch(ArithmeticException are) {
			System.out.println("Arithmetic Exception block "+are);
		}
		catch(Exception e) {
			System.out.println("Exception block");
		}
		finally {
			System.out.println("In finally");
		}
		
		System.out.println("After try/catch/finally blocks");

	}

}
