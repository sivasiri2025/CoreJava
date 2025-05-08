package nonstatic;

public class ExamplNulRef {
	
	static int a = m1();
	static int m1() {
		System.out.println("SV method ExamplNulRef");
		return 20;
	}
	
	static {
		System.out.println("ExamplNulRef in static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main method");

	}
	
	static int m2() {
		System.out.println("ExamplNulRef in m2 method");
		return 40;
	}

}
