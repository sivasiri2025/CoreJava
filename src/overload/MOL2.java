package overload;

public class MOL2 {

	//Ambiguous error: When same argument type parameter method is not found,
	//if parameters of two overloaded methods are matched with give argument type then we get this error. 

	void m1(int i, float f) {
		System.out.println("int, float method");
	}
	
	void m1(float f, int i) {
		System.out.println("float, int method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOL2 mol = new MOL2();
		//mol.m1(10, 10); // ambiguous error
		mol.m1(10, 10.345f);
		
		mol.m1(20.45f, 10);

	}

}
