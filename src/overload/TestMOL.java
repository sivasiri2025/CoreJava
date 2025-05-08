package overload;

public class TestMOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOL4 mol = new MOL4();
		
		mol.add(10, 20);
		mol.add("abc", 20);
		mol.add("abc", "xyz");
		mol.add("10", 10.0);

	}

}
