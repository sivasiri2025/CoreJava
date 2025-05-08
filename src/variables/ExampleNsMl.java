package variables;

public class ExampleNsMl {
	
	//static variables
	static int a = 20;
	static int b = 30;
	
	//non static variable initialization
	int x = 40;
	int y= 50;
	
	public static void main(String[] args) {
		
		//local variables
		int p= 50;
		int q = 60;
		
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);
		
//		System.out.println("x :"+ x);
//		System.out.println("y :"+ y);
		
		ExampleNsMl example = new ExampleNsMl();
		System.out.println("x :"+ example.x);
		System.out.println("Y :"+ example.y);
		
		System.out.println("p :"+ p);
		System.out.println("q :" + q);

	}
	
	static void m1() {
		int a = 20;
		//static int q = 30;
	}
	
	static int m2() {
		return 20;
	}

}
