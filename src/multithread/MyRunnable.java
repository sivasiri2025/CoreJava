package multithread;

public class MyRunnable implements Runnable{

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		System.out.println("Main executed");
	}

	public void run() {
		System.out.println("run execution");
		String strLengh = calculateLength("Java training");
		int length = convertStrLength(strLengh);
		System.out.println("Lenghth is "+ length);
	}
	
	public String calculateLength(String name){
		
		int len = name.length();
		
		String val = String.valueOf(len);
		
		System.out.println(val);
		return val;
	}
	
	public int convertStrLength(String str ) {
		
		int x = Integer.parseInt(str);
		return x;
	}

}
