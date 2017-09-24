package main.java;

public class CounterThread implements Runnable {
	
	private Thread t;
	private boolean flag;
	
	public CounterThread () {

	}
	
	public boolean getFlag() {
		return flag;
	}

	public void run() {
		System.out.println("Running counter thread...");
		try {
			//max counter can be 5 only
			for(int i=1;i<=5;i++) {
				//printing out current count
				System.out.println("Current count is " + i);
				// Let the thread sleep for a while.
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			System.out.println("Counter thread interrupted...");
		}
		System.out.println("Counter thread exiting...");
		flag = false;
	}

	public void start() {
		System.out.println("Starting counter...");
		if (t == null) {
			t = new Thread (this);
			t.start ();
		}
	}
}
