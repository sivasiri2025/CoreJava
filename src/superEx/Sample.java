package superEx;

public class Sample extends Example{

	Sample(){
		System.out.println("Sample 0 param");
	}
	
	Sample(int a){
		super(10);
		System.out.println("Sample 1 param");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
	}

}
