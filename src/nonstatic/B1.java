package nonstatic;

public class B1 extends A1{
	
	int y = m2();
	int m2() {
		System.out.println("B1 m2 method");
		return 20;
	}
	{
		System.out.println("B1 NSB");
	}
	
	B1(){
		System.out.println("B1 constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("B1 NS main method");
		B1 b = new B1();
		System.out.println("B1 x:"+b.x);
		System.out.println("B1 y:"+b.y);

	}

}
