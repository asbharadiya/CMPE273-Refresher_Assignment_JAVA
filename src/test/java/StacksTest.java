package test.java;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Stacks;

public class StacksTest {
	
	private Stack<String> stack;
	private Stacks s;

	@Before
	public void setUp() throws Exception {
		stack = new Stack<>();
		s = new Stacks();
	}

	@After
	public void tearDown() throws Exception {
		stack.clear();
	}

	@Test
	public void isStackEmpty() {
		assertEquals(0, stack.size());
	}
	
	@Test
	public void addLetterToStack() {
		s.addLetterToStack("A", stack);
		assertEquals(1, stack.size());
		s.addLetterToStack("N", stack);
		assertEquals(2, stack.size());
		s.addLetterToStack("K", stack);
		assertEquals(3, stack.size());
		s.addLetterToStack("I", stack);
		assertEquals(4, stack.size());
		s.addLetterToStack("T", stack);
		assertEquals(5, stack.size());
	}
	
	@Test
	public void removeFromStack() {
		s.addLetterToStack("A", stack);
		s.addLetterToStack("N", stack);
		s.addLetterToStack("K", stack);
		s.addLetterToStack("I", stack);
		s.addLetterToStack("T", stack);
		String student = s.removeFromStack(stack);
		assertEquals("T", student);
		assertEquals(4, stack.size());
		student = s.removeFromStack(stack);
		assertEquals("I", student);
		assertEquals(3, stack.size());
	}

}
