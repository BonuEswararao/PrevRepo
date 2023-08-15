package streams.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingOfEmployee {
	
	//List<Employee> employees = new ArrayList<Employee>();
	
	private static List<Employee> getListOfEmployees() {
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		Employee e1 = new Employee("Eswar",28,Arrays.asList("Vizag","Chennai","Coimbatore"));
		Employee e2 = new Employee("Chinna",38,Arrays.asList("Piridi","Chennai","Delhi"));
		Employee e3 = new Employee("Suresh",24,Arrays.asList("Ramavaram","Hyderabad","Bangalore"));
		Employee e4 = new Employee("Rajesh",20,Arrays.asList("Vizag","Piridi","Bobbili"));
		
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		
		return listOfEmployees;
	}

	public static void main(String[] args) {
		List<Employee> employeeList = getListOfEmployees();
		
		//Get list of Employee Names
		List<String> employeeNames = employeeList.stream().map(x->x.getName()).collect(Collectors.toList());
		System.out.println("Get list of Employee Names : "+employeeNames.toString());
		
		//Filter for Employee Whose name starts with S
		List<String> employeeNameStartsWith_S = employeeList.stream().map(x->x.getName()).filter(x->x.startsWith("S")).collect(Collectors.toList());
		System.out.println("Filter for Employee Whose name starts with S : "+employeeNameStartsWith_S.toString());
		
		//Sorting of Employees based on name 
		List<String> employeeSorting = employeeList.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
		System.out.println("Sorting of Employees based on name : "+employeeSorting);
		
		//Limiting the Number of Employees
		List<Employee> limitEmployees = employeeList.stream().limit(2).collect(Collectors.toList());
		System.out.println("Limiting the Number of Employees : "+limitEmployees);
		
		//Skipping first few names
		List<String> skipEmployees = employeeList.stream().map(x->x.getName()).skip(2).collect(Collectors.toList());
		System.out.println("Skipping first few names : "+skipEmployees);
		
		//Flatmap to accumulate list of cities
		List<String> flatMapCities = employeeList.stream().flatMap(x->x.getListOfCities().stream()).collect(Collectors.toList());
		System.out.println("Flatmap to accumulate list of cities : "+flatMapCities.toString());
		
		//Foreach Operation
		employeeList.stream().forEach(x->System.out.print("forEach Operation : "+x.getName()));
		
		//Collect and Collectors Terminal Operation
		List<String> collectNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Collect and Collectors Terminal Operation : "+collectNames.toString());
		
		//All Match to returns true when all the elements in the stream meet provided condition.
		
		boolean allMatchState = employeeList.stream().allMatch(x->x.getAge()>20);
		System.out.println("All Match to returns true when all the elements in the stream meet provided condition : "+allMatchState);
		

	}

}
