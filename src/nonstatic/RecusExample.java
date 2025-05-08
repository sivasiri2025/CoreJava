package nonstatic;

public class RecusExample {
	
	RecusExample example = new RecusExample();
	
	RecusExample(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		RecusExample example = new RecusExample();
	}
}
