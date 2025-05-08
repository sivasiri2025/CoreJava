package variables;

public class DataTypesOne {

	public static void main(String[] args) {
		
		long l = 10;
		int i =  (int) l;
		
		float f1 = 10;
		long b = (long)f1;
		
		long L2 = (long)f1;
		System.out.println(L2);
		
		//Char and number types are compatible type
		
		char ch1 = 'a';
		char ch2 = 97;
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		
		
	}

}
