package methods;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =10;
		int y= 20;
		add(x, y);
		
		concat("Sandeep", "Kurvi");

	}
	
	//parameterized method
	static void add(int d, int s) { //--> method prototype
		int c = d+s;
		System.out.println("Result "+ c);
	}
	
	//parameterized method
	static String concat(String str1, String str2) {
		
		//String s = str1 + str2;
		//System.out.println(s);
		
		return str1 + str2;
	}
	
	//non parameterized method
	int m1() {
		return 10+20;
	}
	
	//return;
	

	
	

}
