package gcExample;

public class ExampleGc {
	
	int x = 10;
	int y = 20;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create reference objects
		ExampleGc exGc1 = new ExampleGc(); //1010 --> x, y values
		ExampleGc exGc2 = new ExampleGc(); //2020 --> x, y values
		
		//created unreferenced objects
		new ExampleGc();
		
		//Storing null to all its referenced variables. 
		exGc1 = null; //1010 empty now
		
		//Storing another object reference to all its referenced variables. 
		exGc2 = new ExampleGc(); // 3030 --> x, y values
		
		
		
		//
		

	}

}
