package streams.com;

public class Employee2 {
	private String name;
	private int age;
	private int departmentId;
	private double salary;
	
	public Employee2(String name, int age, int departmentId, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.departmentId = departmentId;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
