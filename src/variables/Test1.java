package variables;

public class Test1 {
	
	public static void main(String[] args) {
		//<class name> objName = new ClassName();
		Test.m3(new Example());
		Test.m3(new Sample());
		
	}
	//static void m1()
}

class Example{
	void m1() {
		System.out.println("m1 from Example class");
	}
}

class Sample extends Example{
	void m2() {
		System.out.println("m2 from sample class");
	}
}

class Test{
	static void m3(Example e) {
		e.m1();	
		if(e instanceof Sample) {
			Sample s = (Sample) e;
			s.m2();
		}
		//e.m2();
	}
}

