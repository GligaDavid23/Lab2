package ro.ulbs.programare.lab2;

public class Form {
	static int counter=0;
	private String color;
	public Form(){
		color = "white";
		counter++;
	}
	public Form(String color){
		this.color = color;
		counter++;
	}
	public float getArea(){
		return 0;
	}
	public String toString(){
		return "This form has the color " + color;
	}
	public int getCounter(){
		return counter;
	}
}
