package multithread;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("Main executed");

	}

}
