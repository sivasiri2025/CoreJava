package nonstatic;

public class ExampleCons {
	
	ExampleCons(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		ExampleCons ex = new ExampleCons();
	}

}
