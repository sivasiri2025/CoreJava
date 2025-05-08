package nonstatic;

public class ExampleNS {

	int x = 20;
	int y = 30;
	
	void setXY() {
		x = 50; //this.x
		y = 60; //this.y
	}
	void printXY() {
		System.out.println("x :"+x);
		System.out.println("Y :"+ y );
	}
	
	int m2() {
		System.out.println("in m2 method");
		return 20;
	}
	
	void m1() {
		setXY(); // this.setXY()
		printXY(); //this.printXY()
		int c = m2();
		System.out.println("m2 method value c="+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleNS ens = new ExampleNS();
		ens.m1();

	}

}
