package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupbyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(
				new Employee("Pooja", "HR"),
				new Employee("Pratiba", "Engineering"),
				new Employee("Anusha", "HR"),
				new Employee("Sreeja", "Engineering")
				);
		
		//goruping by department
		
		Map<String, List<Employee>> grpByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeparment));
		
		grpByDept.forEach((dept, empList) -> {
			System.out.println(dept + " : "+empList);
		});

	}

}
