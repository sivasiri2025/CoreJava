package variables;

public class TestVariables {

	public static void main(String[] args) {
		//Primitive variables
		
		int p = 50;
		int q = m1(); //1200
		
		
		//assiging variables
		p = 70;
		
		//Declaring a variables
		int b;
		Example e;
		
		//assigning a variable
		b = 50;
		e = new Example();
		
		//reassign a variable
		b = 111;
		
		System.out.println("b ="+ b);
		
		
		
		//reference variables
		String s1 = "a";
		String s2 = new String("a");
		
		//Example e = new Example();

		System.out.println("P value="+ p + " q value="+ q);
		
		int x=10;
		
		//calling x variable for printing
		System.out.println(x);
		
		//calling x variable for initializing y
		int y= x;
		
	}
	
	static int m1() {
		
		System.out.println("in m1 method");
		return 1200;
	}

	
	public static void m2() {
		int a = 20;
		
	}
}

class Example1{
	int x=10;
	int y=20;
}