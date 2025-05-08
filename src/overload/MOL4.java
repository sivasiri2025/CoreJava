package overload;

public class MOL4 extends MOL3{
	
	void add(int x, int y) {
		System.out.println("MOL4 int, int");
	}
	
	float add(float a, int b) {
		System.out.println("MOL4 float, int");
		return a+b;
	}
	
	String add(String s1, double d) {
		System.out.println("MOL4 String, double");
		return s1+d;
	}
	
	

}
