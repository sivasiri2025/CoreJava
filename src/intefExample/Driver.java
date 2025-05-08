package intefExample;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Vehicle v;
		
		v = new RedCar();
		a = 40;
		v.engine();
		v.breaks();
		
		a = 50;
		v = new BMW();
		v.engine();
		v.breaks();
	}

}
