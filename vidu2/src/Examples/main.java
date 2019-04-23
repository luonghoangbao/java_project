package Examples;

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
		employee[0] = new Employee(1,"Nguyen Van A",1,3000,job1 );
		employee[1] = new Employee(2,"Nguyen Van B",2,4000,job2 );
		employee[2] = new Employee(3,"Nguyen Van C",3,5000,job3 );
		employee[3] = new Employee(4,"Nguyen Van D",4,6000,job4 );
		employee[4] = new Employee(5,"Nguyen Van E",5,7000,job5 );
		employee[0].Print();
		employee[1].Print();
		employee[2].Print();
		employee[3].Print();
		employee[4].Print();
		//in ra 1 employee cuoi' cung`
		System.out.println("Mang co :" +employee.length + " phan tu");
		System.out.println("-----------Thong tin employee-----------");
		System.out.println("ID Name Age   Salary  Job name");
		System.out.println(employee[employee.length -1].id + " " + employee[employee.length -1].name + " " + employee[employee.length -1].Salary + "  " + employee[employee.length -1].job.name);
		//in ra 5 employee
		System.out.println("Thong tin cua 5 employee la :");
		System.out.println("ID Name Age   Salary  Job name");
		for(int i = 0; i <= 4; i++) {
			System.out.println(employee[i].id + " " + employee[i].name + " " + employee[i].Salary + "  " + employee[i].job.name);
		}
	}
}


 