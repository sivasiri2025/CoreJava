package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamEamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "", "abcd");
		
		System.out.println("list :"+ strings);
		
		long count = getCountEmptyStringUsingJava7(strings);
		System.out.println("Empty string count "+ count);
		
		int count1 = getCountLenJava7(strings);
		System.out.println("Count of length 3 is"+count1);
		
		String mergedString = mergeStringwithPipe(strings, "|");
		System.out.println(mergedString);
		
		System.out.println("**********java 8 ************");
		
		System.out.println("List :"+ strings);
		//find how many strings are empty
		long ct = strings.stream()
						.filter(str -> str.isEmpty())
						.count();
		
		System.out.println("Empty string count ="+ ct);
		
		long leng3 = strings.stream()
							.filter(str -> str.length() == 3)
							.count();
		System.out.println("length of 3 count"+ leng3);
		
		String mergedString8  = strings.stream()
				.filter(str -> !str.isEmpty()) //abc
				.collect(Collectors.joining("|"));//abc|bc|efg|abcd
		
		System.out.println("mergedString using java8="+ mergedString8);
		
		List<String> strList = strings.stream()
				.filter(e -> ! e.isEmpty())
				.collect(Collectors.toList());//abc, 
		
		System.out.println("strList java8 wihout empty strings "+ strList);
	}
	
	public static long getCountEmptyStringUsingJava7(List<String> value) {//"abc", "", "bc", "efg", "", "abcd"
		int count = 0;
		
		for(String str : value) {//"abc", "", "bc", "efg", "", "abcd"
			if(str.isEmpty()) {
				count ++;
			}
		}
		return count;
	}
	
	public static int getCountLenJava7(List<String> value) {
		int count = 0;
		for(String str : value) {
			if(str.length() == 3) {
				count ++;
			}
		}
		return count;
	}
	
	//"abc", "", "bc", "efg", "", "abcd"
	//abc|bc
	public static String mergeStringwithPipe(List<String> value, String seperater) {
		StringBuilder sb = new StringBuilder();
		
		for(String str: value) {
			if(!str.isEmpty()) {
				sb.append(str); //sb = abc
				sb.append(seperater);
			}
		}
		//sb = abc|bc|efc|abcd
		String result = sb.toString();
		
		return result;
		
		
	}
	
	

}
