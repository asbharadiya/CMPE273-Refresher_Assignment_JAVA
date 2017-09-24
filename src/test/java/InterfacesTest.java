package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Circle;
import main.java.Rectangle;
import main.java.Shape;

public class InterfacesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDrawCircle() {
		Shape s = new Circle(10,10,5);
		String result = s.draw(Shape.BLACK);
		assertEquals("Circle is drawn at position (10.0,10.0) with radius 5.0 and color BLACK", result);
	}
	
	@Test
	public void testDrawRectangle() {
		Shape s = new Rectangle(15,20,50,35);
		String result = s.draw(Shape.RED);
		assertEquals("Rectangle is drawn with top-left position at (15.0,20.0) and bottom-right positon at (50.0,35.0) and color RED", result);
	}

}
