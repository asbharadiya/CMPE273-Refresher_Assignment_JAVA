package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Generics;

public class GenericsTest {
	
	Generics g;

	@Before
	public void setUp() throws Exception {
		g = new Generics();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGreatestElement() {
		Integer grI = g.greatestElement(new Integer[]{10,3,26,67,43});
		assertTrue(grI.equals(67));
		Float grF = g.greatestElement(new Float[]{1.2F,0.7F,5.4F,3.2F,2.7F});
		assertTrue(grF.equals(5.4F));
		String grS = g.greatestElement(new String[]{"orange","apple","pineapple","banana"});
		assertTrue(grS.equals("pineapple"));
	}

}
