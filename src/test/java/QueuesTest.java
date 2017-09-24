package test.java;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Queues;

public class QueuesTest {
	
	private Queue<String> waitlist;
	private Queues q;

	@Before
	public void setUp() throws Exception {
		waitlist = new LinkedList<>();
		q = new Queues();
	}

	@After
	public void tearDown() throws Exception {
		waitlist.clear();
	}

	@Test
	public void isWaitlistEmpty() {
		assertEquals(0, waitlist.size());
	}
	
	@Test
	public void addStudentToWaitlist() {
		q.addStudentToWaitlist("John", waitlist);
		assertEquals(1, waitlist.size());
		q.addStudentToWaitlist("Paul", waitlist);
		assertEquals(2, waitlist.size());
		q.addStudentToWaitlist("Amar", waitlist);
		assertEquals(3, waitlist.size());
		q.addStudentToWaitlist("Gina", waitlist);
		assertEquals(4, waitlist.size());
	}
	
	@Test
	public void removeFromWaitlist() {
		q.addStudentToWaitlist("John", waitlist);
		q.addStudentToWaitlist("Paul", waitlist);
		q.addStudentToWaitlist("Amar", waitlist);
		q.addStudentToWaitlist("Gina", waitlist);
		String student = q.removeFromWaitlist(waitlist);
		assertEquals("John", student);
		assertEquals(3, waitlist.size());
		student = q.removeFromWaitlist(waitlist);
		assertEquals("Paul", student);
		assertEquals(2, waitlist.size());
	}

}
