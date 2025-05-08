package abstExample;

public abstract class Bus {
	
	abstract void engine();
	
	void breaks() {
		System.out.println("when driver use breaks then bus will stop");
	}
	  
	void wheels() {
		System.out.println("Bus will run on 6 wheels");
	}
	
}
