package objExample;

public class FinalizeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//create unreferenced objects
		for(int i=1; i <=20; i++) {
			new Building(new Furniture());
		}
		
		//requesting JVM to run GC
		System.gc();
		System.out.println("after garbage collection");
		
		//puase main thred
		Thread.sleep(1000);
		
	}

}
