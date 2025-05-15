package multithread;

public class MyThreadOne extends Thread{
	
	public void run() {
		for(int i=20; i> 1; i--) {
			System.out.println("run :"+ i);
		}
	}

}
