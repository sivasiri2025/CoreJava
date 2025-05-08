package overload;

public class ExamThis {
	
	public static final String etfId = "VTMBond";
	
	int x = m1();//x=10
	{
		System.out.println("block");
	}
	
	int m1() {
		System.out.println("m1: x");
		return 10;
	}
	
	final static int m4() {
		System.out.println("final method");
		return 10;
	}
	
	ExamThis(){
		this(10);
		x =50;
		System.out.println("No arg constructor x="+x);
	}
	
	ExamThis(int a){
		this("abc");
		x=60;
		System.out.println("int-arg constructor x="+x);
	}
	
	ExamThis(String str){
		x=70;
		System.out.println("String-arg constructor x="+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExamThis e1 = new ExamThis();
//		System.out.println("e1.x ="+ e1.x);
		
//		ExamThis e2 = new ExamThis(10);
//		System.out.println("e2.x="+ e2.x);
		
		ExamThis e3 = new ExamThis("abc");
		System.out.println("e3.x="+ e3.x);
		
	}
}
