package task;

public class Office {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student();
		
		std.setAge(20);
		std.setNo("10");
		std.setSalary(1000d);
		
		int age = findAge(std);
	}
	
	public static int findAge(Student std) {
		
		int age = std.getAge();
		return age;		
	}

}
