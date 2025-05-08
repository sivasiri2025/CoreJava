package stngBuff;

public class SBExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc";
		String s1 = s+"bac";
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println("capacity="+ sb.capacity());//16
		
		StringBuffer sb1 = new StringBuffer(3);
		System.out.println("sb2 capacity="+ sb1.capacity());//3
		
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("Sb2 capacity="+sb2.capacity());//3+16
		
		
//		String fileName = "ETF_JPM_NAV.csv";
//		String[] strArr = fileName.split(".");
//		//0 = ETF_JPM_NAV
//		//1 = csv
//		
//		String fullFileName = makeFileName(strArr[0]);
//		System.out.println("SBFilename ="+fullFileName);
		
		//String fielFormat = getFileExtension(strArr);
		
		//insert
		StringBuilder sb4 = new StringBuilder("334455667");
		System.out.println("sb4="+sb4);
		sb4.insert(2, '-');
		System.out.println("sb char="+sb4);
		sb4.insert(4, '=');
		System.out.println("sb char="+sb4);
		
		StringBuffer sb5 = new StringBuffer("abc bbc cbd");
		//StringBuffer sb10 = "29ju";
		
		System.out.println("sb5 ="+sb5);
		sb5.setCharAt(3, '-');
		System.out.println("sb5 ="+ sb5);
		
		System.out.println("SB delete operation");
		StringBuffer sb6 = new StringBuffer("java Training day 25");
		System.out.println("sb6="+sb6);
		sb6.delete(0, 5);
		System.out.println("sb6="+sb6);
		
		System.out.println("SB reverse operation");
		StringBuffer sb7 = new StringBuffer("abc");
		System.out.println("sb7="+sb7);
		sb7.reverse();
		System.out.println("After reverse="+sb7);
		
		
	}
	
	static String getFileExtension(String[] arr){
		return arr[1];
	}
	
	
	//add US to end of the file name and txt format as well
	static String makeFileName(String name) {
		StringBuilder sb = new StringBuilder(name);
		sb.append("_")
			.append("US")
			.append(".")
			.append("txt");
		return sb.toString();
		
	}
	
	

}
