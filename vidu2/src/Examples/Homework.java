package Examples;

import java.util.Scanner;
import java.util.ArrayList;
public class Homework {

	public static void main(String[] args) {	
		Menu();
	}
	
	public static void Menu()
	{
		
		System.out.println("Menu");
		System.out.println("1 : Create employee");
		System.out.println("2 : Show the existing employee");
		System.out.println("0 : Exit");
		ArrayList<Employee> listEmployee = new ArrayList<Employee>();
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap lua chon : ");
			int luachon = input.nextInt();
			switch(luachon)
			{
			case 1:
				Scanner input1 = new Scanner(System.in);
				System.out.println("Nhap ten nhan vien : ");
				String name = input1.nextLine();
				System.out.println("Nhap cong viec :");
				String jobname = input1.nextLine();
				System.out.println("Nhap id cong viec :");
				int jobid = input1.nextInt();
				Job job = new Job(jobid, jobname);
				System.out.println("Nhap id nhan vien : ");
				int id = input1.nextInt();
				System.out.println("Nhap tuoi nhan vien : ");
				int age = input1.nextInt();
				System.out.println("Nhap tien luong nhan vien : ");
				double Salary = input1.nextDouble();
				Employee employee1 = new Employee(name, id, age, Salary, job);
				listEmployee.add(employee1);
				
				break;
			case 2:
				System.out.println("ID		Name	Salary	 Job name");
				for (Employee a : listEmployee) {
					a.Print();
		        }


				break;
			case 0 :
				return;
			}
				
				
		}
		
	}
	
}

