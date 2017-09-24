package main.java;

public class Circle implements Shape{
	
	double x, y, radius;

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String draw(String color) {
		String text = "Circle is drawn at position (" + x + "," + y + ") with radius " + radius + " and color " + color;
		
		//Drwaing circle
		System.out.println(text);
		
		return text;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
