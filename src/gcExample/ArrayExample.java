package gcExample;

public class ArrayExample {
	

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 27, 51};
				//  0	  1	  2   3   4
		
		//print even numbers  from this array
		
		for(int eVal : arr) {
			if( eVal % 2 == 0) {
				System.out.println("This is even number="+ eVal);
			}else
				System.out.println("This is odd number="+ eVal);
			
		}
	
		
		System.out.println("arr length ="+arr.length);
		
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i] % 2 == 0) 
				System.out.println("This is even number="+ arr[i]);
			else
				System.out.println("This is odd number="+ arr[i]);
		}
		
		// &&(AND)  or ||(OR) 
		
		int a = 20;
		int b = 30;
		
		if(a == 10 || b == 30) {
			System.out.println("a="+a + "b="+b);
		}else
			System.out.println("Else condition");
		
		
	}
}
