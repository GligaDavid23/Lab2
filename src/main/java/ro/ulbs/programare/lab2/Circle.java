package ro.ulbs.programare.lab2;

public class Circle extends Form{
	private float radius;
	public Circle(){
		super();
		radius = 0;
	}
	public Circle(String color, float radius){
		super(color);
		this.radius = radius;
	}
	public float getArea() {
		return radius * radius * (float)Math.PI;
	}
	public String toString(){
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea();
	}
}
