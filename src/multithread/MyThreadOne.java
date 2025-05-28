package multithread;

public class MyThreadOne extends Thread{
	
	public void run() {
		for(int i=20; i> 1; i--) {
			System.out.println("run :"+ i);
			m1(i);
		}
	}
	
	public synchronized void m1(int x) {
		System.out.println("In m1 method");
		int a = x + 20;
		System.out.println("a ="+ a);
		System.out.println("end of m1 method");
	}

}
