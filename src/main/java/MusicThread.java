package main.java;

public class MusicThread implements Runnable {

	private Thread t;
	private boolean flag;
	
	public MusicThread () {

	}
	
	public boolean getFlag() {
		return flag;
	}

	public void run() {
		try {
			System.out.println("Music playing...");
			// Let the music play for 12-13 seconds.
			Thread.sleep(12000);
		}catch (InterruptedException e) {
			System.out.println("Music interrupted...");
		}
		System.out.println("Music stopping...");
		flag = false;
	}

	public void start() {
		System.out.println("Starting music...");
		if (t == null) {
			t = new Thread (this);
			t.start ();
		}
	}
	
}
