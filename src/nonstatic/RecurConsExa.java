package nonstatic;

public class RecurConsExa {
	
	//StackOverflowError
	RecurConsExa(){
		System.out.println("Constructor");
		RecurConsExa ex = new RecurConsExa();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		RecurConsExa ex = new RecurConsExa();

	}

}
