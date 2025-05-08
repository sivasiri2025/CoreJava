package overload;

public class Example {
	
	void add() {
		System.out.println("No arg add");
	}
	
	void add(int workunitVal) {
		System.out.println("int arg method="+workunitVal);
	}
	
	void add(String s) {
		System.out.println("string arg method= "+s);
	}
	
//	int add(double s) {
//		System.out.println("int add method");
//		return 10;
//	}
	
	static String m1() {
		return "10";
	}
	
	static void m2(String s) {
		System.out.println("");
	}
	
	static int finance(String s) {
		System.out.println("print s="+s);
		return 10;
	}
	
	static String account(int accVal) {
		System.out.println("val ="+ accVal);
		return "sucess";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();
		e.add();
		e.add(10);
		e.add("Java Training");
		m2(m1());
		int c = finance(m1());
		
		String s = account(c);
		System.out.println(s);//This account method is goign to return a string and print that value for now.
	}
}
