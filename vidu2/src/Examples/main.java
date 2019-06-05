package Examples;
//cach dung binh thuong
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1 = new Job(1, "HR");
		Job job2 = new Job(2, "Ba");
		Job job3 = new Job(3, "Tester");
		Job job4 = new Job(4, "Developer");
		Job job5 = new Job(5, "CEO");
		
			// TODO Auto-generated method stub
		Employee[] employee = new Employee[5];
		employee[0] = new Employee("Nguyen Van A", 1, 20, 3000, job1 );
		employee[1] = new Employee("Nguyen Van B", 2, 18, 4000, job2 );
		employee[2] = new Employee("Nguyen Van C", 3, 17, 5000, job3 );
		employee[3] = new Employee("Nguyen Van D", 4, 15, 6000, job4 );
		employee[4] = new Employee("Nguyen Van E", 5, 14, 7000, job5 );
		employee[0].Print();
		employee[1].Print();
		employee[2].Print();
		employee[3].Print();
		employee[4].Print();
		//in ra 1 employee cuoi' cung`
		System.out.println("Mang co :" +employee.length + " phan tu");
		System.out.println("-----------Thong tin employee-----------");
		System.out.println("ID Name          Age   Salary  Job name");
		System.out.println(employee[employee.length -1].getId() + " " + employee[employee.length -1].getName() + "    "+ employee[employee.length -1].getAge() + " " + employee[employee.length -1].getSalary() + "  " + employee[employee.length -1].getJob());
		//in ra 5 employee
		System.out.println("Thong tin cua 5 employee la :");
		System.out.println("ID Name          Age   Salary  Job name");
		for(int i = 0; i <= 4; i++) {
			System.out.println(employee[i].getId() + " " + employee[i].getName() + "   " + employee[i].getAge() + "    " + employee[i].getSalary() + "  " + employee[i].getJob());
		}
	}
}


 