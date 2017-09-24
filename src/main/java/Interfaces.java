package main.java;

public class Interfaces {
	
	public void run() {
		//Initializing shapes
		Shape[] shapes = new Shape[] {new Circle(10,10,5), new Rectangle(15,20,50,35)};
		
		//Drawing shapes
		for(Shape s:shapes) {
			s.draw(Shape.RED);
		}
	}
	
}
