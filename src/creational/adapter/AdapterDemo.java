package creational.adapter;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

	EmployeeClient client = new EmployeeClient();

	List<Employee> employees = client.getEmployeeList();

	for (Employee employee : employees) {
	    System.out.println(employee);
	}
    }
}
