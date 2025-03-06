package ro.ulbs.programare.lab2;

public class Square extends Form {
	private float side;
	public Square() {
		super();
		side = 0;
	}
	public Square(String color, float side) {
		super(color);
		this.side = side;
	}
	public float getArea() {
		return side * side;
	}
	public String toString() {
		return super.toString() + " " + side;
	}
}
