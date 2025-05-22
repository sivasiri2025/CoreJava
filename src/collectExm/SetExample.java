package collectExm;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> setStr = new HashSet<>();
		
		setStr.add("java");
		setStr.add("cpp");
		setStr.add("oracle");
		setStr.add("oracle");
		
		for(String eachVal : setStr) {
			System.out.println(eachVal);
			System.out.print(",");
		}
		System.out.println("After removed the first character");
		
		setStr.forEach(e -> System.out.println(e));
	}

}
