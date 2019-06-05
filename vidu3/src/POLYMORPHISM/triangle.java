package POLYMORPHISM;

public class triangle extends Shape {
	private int base;
	private int height;
	public triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return this.getColor();
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*this.base*this.height;
	}
}
