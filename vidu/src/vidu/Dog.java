package vidu;

public class Dog{
	public String name;
	public String color;
	public String breed;
	Dog(String name, String color, String breed)
	{
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	public void Print()
	{
		System.out.println("Name : "+ name);
		System.out.println("Color : "+ color);
		System.out.println("Breed : "+ breed);
	}
	public void waggingTheTail()
	{
		if(this.name == "Pu")
		{
		System.out.println("Vay duoi xuong");
		}
		else if(this.name == "Lu")
		{
			System.out.println("Bi dut duoi khong vay duoc ");
		}
		else if(this.name == "Su")
		{
			System.out.println("Vay duoi len");
		}
	}
	public void barking()
	{
		if(this.name == "Pu")
		{
		System.out.println("Gau Gau");
		}
		else if(this.name == "Lu")
		{
			System.out.println("Sua it  ");
		}
		else if(this.name == "Su")
		{
			System.out.println("Bi khoa mom");
		}
	}
	public void eating()
	{
		if(this.name == "Pu")
		{
		System.out.println("Gam xuong");
		}
		else if(this.name == "Lu")
		{
			System.out.println("An com ");
		}
		else if(this.name == "Su")
		{
			System.out.println("An chuot");
		}
	}
}
