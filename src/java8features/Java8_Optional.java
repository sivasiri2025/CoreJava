package java8features;

import java.util.Optional;

public class Java8_Optional {

	public static void main(String[] args) {
		Java8_Optional java8_Optional = new Java8_Optional();
		
		Integer val1 = null;
		Integer val2 = new Integer(10);
		
		//Optional.ofNullable --> allows passed paramter to be null
		Optional <Integer> a = Optional.ofNullable(val1);
		
		//optional.of --> throws nullpointer exception if passed parameter is null
		//Optional<Integer> a1 =  Optional.of(val1);
		
		Optional<Integer> b = Optional.of(val2);
		System.out.println(java8_Optional.sum(a, b));
		System.out.println("after java 8");
		
		optionalElseThrowException();
	}
	
	public int sum(Optional<Integer> a, Optional<Integer> b) {
		
		//Optional.isPresent --> checks value is present or not
		System.out.println("first parameter is present "+ a.isPresent());
		System.out.println("second paramter is present "+ b.isPresent());
		
		//optional orElse --> returns the value if present otherwise retuns the default value passed
		Integer val1 = a.orElse(20);
		
		Integer val2 = b.get();
		
		return val1 + val2;
		
	}
	
	public static void optionalElseThrowException() {
		//Optional<Integer> oi = Optional.empty();
		Optional<Integer> oi = Optional.of(100);
		System.out.println("Optional :"+ oi);
		try {
			System.out.println(oi.orElseThrow(ArithmeticException::new));
		}catch(Exception e) {
			System.out.println("Exception at optionalElseThrowException "+e);
		}
		
		
	}
}
