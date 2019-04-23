package vidu;

public class Student {
	public String name;
	public int age;
	public String gender;
	public Student(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void print() {
	System.out.println("name is :" + name);
	System.out.println("age is :" + age);
	System.out.println("gender is :" + gender);
}
	}
