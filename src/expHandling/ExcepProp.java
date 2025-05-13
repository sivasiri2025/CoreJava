package expHandling;

public class ExcepProp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before calling m1 method");
		m1();
		System.out.println("after calling m1 methd");
	}
	
	static void m1() {
		//try {
			System.out.println("In m1 method");
			System.out.println(10/0);
			System.out.println("M1 method end");
		//}catch(Exception e) {
			//System.out.println("in m1 method catch block"+e);
		//}
	}

}
