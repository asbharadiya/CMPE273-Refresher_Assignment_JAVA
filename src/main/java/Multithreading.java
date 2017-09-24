package main.java;

public class Multithreading {

	public void run() {
		CounterThread T1 = new CounterThread();
		T1.start();

		MusicThread T2 = new MusicThread();
		T2.start();
	}

}
