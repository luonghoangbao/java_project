package Examples;

import java.util.ArrayList;
import static Examples.ManagerEmployee.scanner;

	public abstract class EmployeeImpl implements EmployeeDAO {

	    @Override
	    public void addEmployee(ArrayList<Employee> employees) {
	        	System.out.println("How many employee you want to create? : ");
			int employeeNo = scanner.nextInt();
	        employees = new ArrayList<Employee>();
	        for (int i = 0; i < employeeNo; i++) {
	        	System.out.println("Please input the information of employee[" + (i + 1) + "] : ");
				System.out.println("Name : ");
				String name = scanner.next();
				System.out.println("Salary : ");
				double salary = scanner.nextDouble();
				System.out.println("Age : ");
				int age = scanner.nextInt();
				System.out.println("Job name : ");
				String jobName = scanner.next();
				Employee employee = new Employee(name, i + 1, age, salary, new Job(i + 1, jobName));
	            employees.add(employee);
	    }
	    }

	    @Override
	    public void showEmployee(ArrayList<Employee> employees) {
	    	System.out.println("----------------List of employee-----------");
			System.out.println("ID   Name      Salary    Job name");
			// Duyet mang kieu for-each
			for(Employee employee : employees){
				System.out.println(employee.getId() + " " + employee.getName() + "   " + employee.getAge() + "    " + employee.getSalary() + "  " + employee.getJob());
			}
	    }

	    @Override
	    public Employee searchEmployeeByName(String nameInput, ArrayList<Employee> employees) {
	    	Employee employee = null;
	        for(int i =0; i<employees.size(); i++){
	        	if(nameInput.equals(employees.get(i).getName())){
	        		employee = employees.get(i);
	                break;
	            }
	       }
			return employee;
		}

	    @Override
	    public void updateEmployeeByName(String nameInput, Double newSalary, ArrayList<Employee> employees) {
	    	for (int i = 0; i< employees.size(); i++) {
				if (nameInput.equals(employees.get(i).getName())) {
					employees.get(i).getSalary();
					break;
				}
	       }
	 }
}
