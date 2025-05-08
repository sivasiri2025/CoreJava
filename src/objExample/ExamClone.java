package objExample;

public class ExamClone implements Cloneable{

	int x = 10;
	int y = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		ExamClone e1 = new ExamClone();
		e1.x = 5;
		e1.y = 6;
		
		ExamClone e2 = (ExamClone) e1.clone();
		
		System.out.println(e1.hashCode() == e2.hashCode());
		
		System.out.println(e1.x +"...."+e1.y);
		System.out.println(e2.x +".... "+e2.y);
		
		e2.x= 10;
		e2.y = 15;
		System.out.println();
		System.out.println(e1.x +"...."+e1.y);
		System.out.println(e2.x +".... "+e2.y);
	}

}
