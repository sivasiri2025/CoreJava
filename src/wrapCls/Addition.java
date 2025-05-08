package wrapCls;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer io1 = Integer.valueOf(50);
		Integer io2 = Integer.valueOf(60);
		Integer io3 = Integer.valueOf(io1.intValue() + io2.intValue()); //WCO => PDT
		
		System.out.println("Io3="+ io3);

	}

}
