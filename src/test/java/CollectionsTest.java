package test.java;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Collections;

public class CollectionsTest {
	
	Collections c;
	HashSet<String> numbers;

	@Before
	public void setUp() throws Exception {
		c = new Collections();
		numbers = new HashSet<>();
	}

	@After
	public void tearDown() throws Exception {
		numbers.clear();
	}
	
	@Test
	public void testIsSetEmpty() {
		assertEquals(0, numbers.size());
	}

	@Test
	public void testAddNumberToSet() {
		c.addNumberToSet("9999999999", numbers);
		assertEquals(1, numbers.size());
		c.addNumberToSet("9191919191", numbers);
		assertEquals(2, numbers.size());
		c.addNumberToSet("9191919191", numbers);
		assertEquals(2, numbers.size());
		c.addNumberToSet("9292929292", numbers);
		assertEquals(3, numbers.size());
	}

}
