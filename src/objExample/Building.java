package objExample;

public class Building {
	
	Furniture f;
	
	Building(Furniture f){
		this.f = f;
	}
	
	@Override
	public void finalize() {
		System.out.println("In finalize method");
		f = null;
	}

}

class Furniture {
	double cost = 100;
}