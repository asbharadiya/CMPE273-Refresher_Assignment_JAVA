package test.java;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.CounterThread;
import main.java.MusicThread;

public class MultithreadingTest {
	
	private CounterThread T1;
	private MusicThread T2;

	@Before
	public void setUp() throws Exception {
		T1 = new CounterThread();
		T2 = new MusicThread();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultithreading() {
		T1.start();
		T2.start();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertFalse(T1.getFlag());
		assertFalse(T1.getFlag());
	}

}
