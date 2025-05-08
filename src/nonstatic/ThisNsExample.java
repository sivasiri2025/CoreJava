package nonstatic;

public class ThisNsExample {
	
	int x = 10;
	int y = 20;
	
	void m1() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(this.x);
//		System.out.println(this.y);

	}

}
