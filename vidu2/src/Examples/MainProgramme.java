package Examples;

//cach dung mang Array
import java.util.ArrayList;
import java.util.Iterator;

public abstract class MainProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1 = new Job(1, "HR");
		Job job2 = new Job(2, "Ba");
		Job job3 = new Job(3, "Tester");
		Job job4 = new Job(4, "Developer");
		Job job5 = new Job(5, "CEO");
		Employee employee1 = new Employee("Nguyen Van A", 1, 20, 3000, job1 );
		Employee employee2 = new Employee("Nguyen Van B", 2, 18, 4000, job2 );
		Employee employee3 = new Employee("Nguyen Van C", 3, 17, 5000, job3 );
		Employee employee4 = new Employee("Nguyen Van D", 4, 15, 6000, job4 );
		Employee employee5 = new Employee("Nguyen Van E", 5, 14, 7000, job5 );
		ArrayList<Employee> employees = new ArrayList<Employee>();
		//linkedList su dung cac con tro de lien ket voi nhau(tien loi hon arraylist)
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		System.out.println("Mang co :" +employees.size() + " phan tu");
		System.out.println("-----------Thong tin employee-----------");
		System.out.println("ID Name          Age   Salary  Job name");
		for(Employee employee : employees){
			System.out.println(employee.getId() + " " + employee.getName() + "   " + employee.getAge() + "    " + employee.getSalary() + "  " + employee.getJob());
		}
	
		System.out.println("-----------Thong tin employee-----------");
		Iterator<Employee> itr = employees.iterator();
		while(itr.hasNext()) {
			Employee item = itr.next();
			System.out.println(item.getId() + " " +item.getName() + "   " + item.getAge() + "    " + item.getSalary() + "  " + item.getJob());

		}

	}

}

/* Show list through Iterator
Iterator<String>  itr = list.iterator();
While(itr.hasNext()){
	System.out.print(itr.next() + " , " );
}

Show list through for -each
System.out.println();
for(String obj : list){
System.out.print(obj + " , " );
*/
