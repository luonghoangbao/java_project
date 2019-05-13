package Examples;

import java.util.ArrayList;

public interface EmployeeDAO {
	public void addEmployee(ArrayList<Employee> employees);
	public void showEmployee(ArrayList<Employee> employees);
	public Employee searchEmployeeByName(String nameInput, ArrayList<Employee> employees);
	public void updateEmployeeByName(String nameInput, Double newSalary, ArrayList<Employee> employees);
	
	
}
