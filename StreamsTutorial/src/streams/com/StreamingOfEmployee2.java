package streams.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingOfEmployee2 {
	
	
	private static List<Employee2> getListOfEmployees(){
		List<Employee2> employeesList = new ArrayList<Employee2>();
		Employee2 e1 = new Employee2("Eswar",28,2,10000.00);
		Employee2 e2 = new Employee2("Chinna",26,5,10045.00);
		Employee2 e3 = new Employee2("Suresh",15,8,14000.00);
		Employee2 e4 = new Employee2("Rajesh",15,2,1000.00);
		employeesList.add(e1);
		employeesList.add(e2);
		employeesList.add(e3);
		employeesList.add(e4);
		
		return employeesList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Employee2> employees = getListOfEmployees();
		
			//Print the employee name whose age is greater than 20
			employees.stream().filter(obj->obj.getAge()>20).forEach(x->System.out.println(x.getName()));
			
			//count the number of employees whose age is 15
			long count = employees.stream().filter(obj->obj.getAge()==15).count();
			System.out.println("Employees count whose age is 15 : "+count);
	}

}
