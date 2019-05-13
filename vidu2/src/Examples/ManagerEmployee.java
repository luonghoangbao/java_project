/**
 * 
 */
package Examples;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LuongHoangBao
 *
 */
public class ManagerEmployee{
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	//public static Employee[] employees;
	public static ArrayList<Employee>employees = new ArrayList<Employee>();
	public static boolean isEndProgram = false;
	public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	
	public static void showMenu() {
		//khoi tao doi' tuong. de? lay' thuoc. tinh' cua? doi'tuong. do'
		EmployeeDAO employeeDAO = new EmployeeImpl() {}; 
		do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: exit");
			System.out.println("4: Search employee by name");
			System.out.println("5: updateEmployeeByName");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				employeeDAO.addEmployee(employees); //doi' tuong. khoi? tao. .Method
				askForContinue();
				break;
			case 2:
				if (employees != null && employees.size() > 0) {
					employeeDAO.showEmployee(employees);
				} else {
					System.out.println("Please add new employee first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Please input name to search:");
				String nameInput = scanner.next();
				Employee employee = employeeDAO.searchEmployeeByName(nameInput, employees);
//tao ra 1 doi tuong employee de lay ket qua tra ve...vi ham` return ve` gtri employee.
				System.out.println("-----Thong tin tim kiem------");
				System.out.println(employee.getId() + " " + employee.getName() + "	 " + employee.getSalary());
				askForContinue();
			case 5:
				System.out.println("Please input name to update salary");
				String nameInputUpdate = scanner.next();
				System.out.println("NewSalary : ");
				double newSalary = scanner.nextDouble();
				//contains la ham lay 1 ki tu trong 1 chuoi ki tu
				//vi du nhap ten Thanh thi` van~ in ra day` du? thong tin cua Nguyen Tan Thanh
				String fullname = "Nguyen Tan Thanh";
				if(fullname.contains(nameInputUpdate)) {
					//do something
				}	
				employeeDAO.updateEmployeeByName(nameInputUpdate, newSalary, employees);
				askForContinue();
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 3);
	}

	public static void askForContinue() {
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
	}
}
	
	// TODO : cac ban lam tiep bai tap nay
	// 4. Tim kiem nhan vien theo ten. Vd : searchEmployeeByName("Loc"); -> List danh sach tat ca nhan vien ten Loc
	// 5. Cap nhat lai luong nhan vien theo ten. Vd : updateEmployee("Loc", 2000) -> tat ca employee ten Loc se co salary 2000
