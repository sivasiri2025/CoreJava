package nonstatic;

public class NSBlock {

	{
		System.out.println("NSB1");
	}
	
	NSBlock(){
		System.out.println("in constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method");
		NSBlock nsb = new NSBlock();
	}
	
	{
		System.out.println("NSB2");
	}

}
