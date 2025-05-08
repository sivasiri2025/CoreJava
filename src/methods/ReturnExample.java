package methods;

public class ReturnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(10);
		m1(20);
		
		int res1 = m2(10);
		System.out.println("res1 "+ res1);
		int res2 = m2(20);
		System.out.println("res2 " + res2);

	}
	
	static void m1(int a) {
		System.out.println("m1: before if");
		if(a == 10) {
			System.out.println("m1: in if for m1 method");
			return;
		}
		System.out.println("m1: after if");
		System.out.println("m1: Hi");
	}
	
	static int m2(int a) {
		System.out.println("m2: before if");
		if(a ==10) {
			System.out.println("m2 in If");
			return a+10;
		}
		System.out.println("After if");
		System.out.println("Hi");
		return 50;
	}

}
