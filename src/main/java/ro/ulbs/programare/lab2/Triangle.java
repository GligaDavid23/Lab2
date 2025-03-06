package ro.ulbs.programare.lab2;

public class Triangle extends Form {
	private float height;
	private float base;
	public Triangle(){
		super();
		height = 0;
		base = 0;
	}
	public Triangle(String color, float height, float base){
		super(color);
		this.height = height;
		this.base = base;

	}
	public float getArea(){
		return base*height;
	}
	public String toString(){
		return super.toString() + "\nHeight: " + height + "\nBase: " + base;
	}
	public Boolean equals(Triangle triangle){
		return triangle.height==(Math.sqrt(3)*base)/2;
	}
}
