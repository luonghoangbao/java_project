package vidu;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student a = new Student("Vuong", 5, "bede");
		a.Print();
		Student b = new Student("VuongPhan", 19, "girl");
		b.Print();
		Student c = new Student("DinhVuong", 20, "be gai");
		c.Print();
		*/
		Dog a  = new Dog("Pu", "black", "girl");
		System.out.println("Dog 1 : ");
		a.Print();
		a.waggingTheTail();
		a.barking();
		a.eating();
		System.out.println(" ");
		Dog b = new Dog("Su", "while","boy");
		System.out.println("Dog 2 : ");
		b.Print();
		b.waggingTheTail();
		b.barking();
		b.eating();
		System.out.println(" ");
		Dog c = new Dog("Lu", "black and white", " girl");
		System.out.println("Dog 3 : ");
		c.Print();
		c.waggingTheTail();
		c.barking();
		c.eating();
		
	}

}