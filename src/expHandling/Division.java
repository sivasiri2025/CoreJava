package expHandling;

import variables.ArthmeticOperation;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = Integer.parseInt(args[0]);//100
			int b = Integer.parseInt(args[1]);//java
			
			int c = a/b;
			System.out.println("c value="+ c);
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			int a =30;
			int b = 40;
			System.out.println("Please pass altease two integer vales"+(a+b));
			
		}catch(NumberFormatException nfe) {
			System.out.println("Please pass only integer values");
		}catch(ArithmeticException ae) {
			System.out.println("Pleaes don't pass second value as zero");
		}catch(Exception e) {
			
		}
		finally {
			
		}

	}

}
