package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Arrays;

public class ArraysTest {
	
	private Arrays a;
	private String[] students;

	@Before
	public void setUp() throws Exception {
		a = new Arrays();
		students = new String[]{"Stud1","Stud2","Stud3","Stud4","Stud5",
              		"Stud6","Stud7","Stud8","Stud9","Stud10",
              		"Stud11","Stud12","Stud13","Stud14","Stud15"};;
	}

	@After
	public void tearDown() throws Exception {
		students = null;
	}

	@Test
	public void isArrayIntialized() {
		assertEquals(15, students.length);
	}
	
	@Test
	public void getStudentForRollNumberTest() {
		String student = a.getStudentForRollNumber(5, students);
		assertEquals("Stud5", student);
		student = a.getStudentForRollNumber(9, students);
		assertEquals("Stud9", student);
	}

}
