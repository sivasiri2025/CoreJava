package methods;

public class SampleTest {
	
	static int a= 10;
	static int b = 20;
	
	int x =10;
	int y = 20;
	
	public static void main(String[] args){
		int p = 60;
		int q = 70;
		
		SampleTest s1 = new SampleTest();
		SampleTest s2 = new SampleTest();
		
		System.out.println(s1.x);
		System.out.println(s2.x);
		
		System.out.println(s1.toString());

	}
	
	void m1() {
		System.out.println("m1");
	}
	
	void printXY() {
		System.out.println(x);
		System.out.println(y);
		m1(); // this.m1(); --> compilier places it.. 
	}

}

//Method Area 

