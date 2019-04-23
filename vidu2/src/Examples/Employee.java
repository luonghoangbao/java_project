package Examples;

public class Employee {
	protected String name;
	protected int id;
	protected double Salary;
	protected int age;
	protected boolean Married;
	protected Job job;
	Employee(int id,String name,int age,double Salary,Job job){
		this.id = id;
		this.name = name;
		this.age = age;
		this.Salary = Salary;
		this.job = job;
	}
	public void Print()
	{
		System.out.println("Name : "+ id);
		System.out.println("Color : "+ name);
		System.out.println("Breed : "+ age);
		System.out.println("Color : "+ Salary);
		System.out.println("Breed : "+ job.name);
	}
}
