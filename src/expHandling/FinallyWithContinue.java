package expHandling;

public class FinallyWithContinue {

	public static void main(String[] args) {
		
		for(int i=0; i<= 10; i++) {
			System.out.println("in loop:"+ i);
			try {
				System.out.println("In try");
				if(i == 5) {
					//break;
					//continue;
					return;
				}
			}finally {
				System.out.println("In finally");
			}
			System.out.println("After try/finally");
		}
		System.out.println("after for loop");
	}
}

//break output --> 

//continue output --> 
//return output --> 
