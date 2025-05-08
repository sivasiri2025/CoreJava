package overload;

public class MOL3 {
	
	void add(int a, int b) {
		System.out.println("MOL3 int, int");
	}
	
	void add(String a, float b) {
		System.out.println("MOL3 string, float");
	}
	
	int add(String s1, String s2) {
		System.out.println("MOL3 String, String");
		return 20;
	}

}
