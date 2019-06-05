package Examples;

public class Employee {
	private String name;
	private int id;
	private double Salary;
	private int age;
	private boolean Married;
	private Job job;
	Employee(String name, int id, int age, double Salary, Job job){
		this.name = name;
		this.id = id;
		this.age = age;
		this.Salary = Salary;
		this.job = job;
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return Married;
	}

	public void setMarried(boolean married) {
		Married = married;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void Print()
	{
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ id);
		System.out.println("Age : "+ age);
		System.out.println("Salary : "+ Salary);
		System.out.println("Job : "+ job.name);
	}
}
