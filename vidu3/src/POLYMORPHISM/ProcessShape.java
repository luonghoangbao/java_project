package POLYMORPHISM;

public class ProcessShape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle triangle1 = new triangle("red", 10, 5);
		System.out.println("Mau sac tam giac : " + triangle1.getColor());
		System.out.println("Dien tich tam  giac : " + triangle1.getArea());
		Rectangle rectangle = new Rectangle("blue", 10, 5);
		System.out.println("Mau sac tam giac : " + rectangle.getColor());
		System.out.println("Dien tich hinh chu nhat : " + rectangle.getArea());
	}
}
