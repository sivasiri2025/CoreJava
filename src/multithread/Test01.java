package multithread;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadOne mt = new MyThreadOne();
		
		mt.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println("main :"+ i);
		}
	}

}
