package nonstatic;

public class ConstrucExample {
	
	ConstrucExample(){
		System.out.println("No arg constructor ");
	}
	
	ConstrucExample(int a){
		System.out.println("int arg constructor");
	}
	
	ConstrucExample(String s){
		System.out.println("String-arg constructor ");
	}
	
	static int a = m1();
	static int m1() {
		System.out.println("In m1 method");
		System.out.println(a);
		return 10;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstrucExample c1 = new ConstrucExample();
		ConstrucExample c3 = new ConstrucExample("DZT");
		ConstrucExample c2 = new ConstrucExample(10);
		System.out.println("Main Method end");
		
		System.out.println("a value ="+a);
		
	}

}
