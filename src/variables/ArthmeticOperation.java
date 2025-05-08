package variables;

import java.util.Scanner;

public class ArthmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(22/7 * 10 * 10);
		
		// int/int = int it won't give decimal values
		
		String s = "a" + 10;
		System.out.println(s);
		String s1 = "a" + "b";
		System.out.println(s1);
		System.out.println(4*2+8/2); 
		
		// *,/, % operators have highest and same precedence
		// +,- operates have next and same and precedence
		
		//We can't divide an integer number by zero it leads to Arthmetic exception
		
		//System.out.println(10/0);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("name = "+ name);
		
	}
}
