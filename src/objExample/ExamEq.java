package objExample;

public class ExamEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b = 30;
		int c = 20;
		System.out.println(a==c);
		System.out.println(a==b);
		
		if(a == c) {
			System.out.println("a and c values are same");
		}
		
		ExamEq eq1 = new ExamEq(); //1010
		ExamEq eq2 = new ExamEq();	//2020
		ExamEq eq3 = eq1;
		//ExamEq eq4 = 
		
		System.out.println(eq1 == eq2);
		System.out.println(eq3 == eq1);
		
		System.out.println(eq1.equals(eq3));
		
		String name = eq1.getClass().getName();
		
		System.out.println("getName ="+name);
		System.out.println("toString ="+eq1.toString());
		System.out.println("without toString ="+eq1);
		
	}
}
