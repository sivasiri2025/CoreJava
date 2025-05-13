package expHandling;

public class ThroException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10;
			System.out.println("In main method");
			
			String s = calculateSquare(a);
			
			System.out.println(s);
		}catch(Exception e) {
			System.out.println("In main method catch block"+ e);
		}

	}
	
	public static String calculateSquare(int a) {
		try {
			int val = a ^ 2;
			
			
			//Integer.parseInt(val);
			String out = String.valueOf(val);
			int x = 10/0;
			//return val.toString();
			return out;
		}catch(Exception e) {
			throw e;
		}
	}
	
	public static Integer employeeSalary() throws Exception{
		
		Integer e = 20000;
		
		Integer result = e*5;
		return result;
	}
	
	public static void testMethod() {
		try {
			employeeSalary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
