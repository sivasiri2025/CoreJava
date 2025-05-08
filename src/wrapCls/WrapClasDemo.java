package wrapCls;

public class WrapClasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. PDT --> WCO conversion
		
		int i = 50;
		//Integer io1 = new Integer(i);
		Integer io2 = Integer.valueOf(i);
		
		//2. WCO --> PDT convertsion
		
		Integer io3 = Integer.valueOf(50);
		int primInt = io3.intValue();
		System.out.println("primiInt ="+ primInt);
		
		//3. PSO ==> WCO conversion
		Byte b1 = Byte.valueOf("1");
		Float f = Float.valueOf("5");
		
		//true || false ==> WCO
		Boolean b2 = new Boolean("true");
		Boolean b3 = Boolean.valueOf("true");
		System.out.println("boolean b3="+b3);
		
		//4. PSO ==> PDT conversion
		int i1 = Integer.parseInt("100");
		
		byte b5 = Byte.parseByte("10");
		
		//5 WCO ==> String object conversion
		Integer io6 = new Integer(95);
		String s = io3.toString();
		
		//6 PDT ==> PSO
		String s1 = Integer.toString(20);
		String s2 = Float.toString(10f);
		

	}

}
