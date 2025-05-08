package nonstatic;

public class A1 {
	
	{
		System.out.println("A1 NSB");
	}
	int x = m1();
	int m1() {
		System.out.println("A1 NSV");
		return 10;
	}
	
	
	A1(){
		System.out.println("In A1 Constructor");
	}

}
