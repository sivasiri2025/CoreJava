package java8features;

public class Employee {
	
	private String name;
	private String deparment;
	
	
	public Employee(String name, String deparment) {
		super();
		this.name = name;
		this.deparment = deparment;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", deparment=" + deparment + "]";
	}
	
	

}
