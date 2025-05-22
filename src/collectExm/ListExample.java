package collectExm;

import java.util.ArrayList;
import java.util.List;

//import java.util.*;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		strList.add("Table");
		strList.add("Chair");
		strList.add("Printer");
		
		System.out.println("For loop conditional");
		for(int i=0; i< strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("for loop");
		for(String  eachStr: strList) {
			
			System.out.println(eachStr);
		}
		
		System.out.println("while condition");
		int i = 0;
		while(i < strList.size()) {
			System.out.println(strList.get(i));
			i ++;
		}
		
		System.out.println("In java8 ");
		strList.forEach(e -> System.out.println(e));
		
		
		
		if(strList.contains("Printer")) {
			System.out.println("Yes list contains printer");
		}
		
		List<String> modiFiedList = findChar(strList);
		//if chair is there in list add chair2 in the list and return the modified list
	}

	public static List<String> findChar(List<String> strList){
		
		if(strList.contains("Chair")) {
			strList.add("chair2");
		}
		return strList;
	}
}
