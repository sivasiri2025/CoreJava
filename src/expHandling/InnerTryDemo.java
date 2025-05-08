package expHandling;

public class InnerTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("a ="+a);
			try {
				int[] x = new int[a];
				int[] a1 = {10, 20, 30, 40};
				System.out.println("array size :"+x.length);
				System.out.println("array size of a1:"+a1.length);
			}catch(NegativeArraySizeException nas) {
				int[] x = new int[3];
				System.out.println("array size:"+x.length);
			}
			int b= a+20;
			System.out.println("b :"+ b);
			
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("pass value");
		}catch(NumberFormatException nfe) {
			System.out.println("pass only int value");
		}

	}

}
