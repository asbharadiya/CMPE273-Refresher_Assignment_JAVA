package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	
	public void run() {
		Queue<String> waitlist = new LinkedList<>();
		
		//Adding students to waiting list
		addStudentToWaitlist("John", waitlist);
		addStudentToWaitlist("Donna", waitlist);
		addStudentToWaitlist("Sameer", waitlist);
		addStudentToWaitlist("Nicole", waitlist);
		addStudentToWaitlist("Adam", waitlist);
		
		System.out.println("Waitlist: " + waitlist);
		
		//Removing a student from waiting list after giving out add code
		removeFromWaitlist(waitlist);
		
		System.out.println("Waitlist after giving out one add code: " + waitlist);
		
		//Clear waiting list after filling out all the seats
		waitlist.clear();
		
		System.out.println("Waitlist after filling out all the seats: " + waitlist);
	}

	public void addStudentToWaitlist(String student, Queue<String> waitlist) {
		waitlist.add(student);
	}

	public String removeFromWaitlist(Queue<String> waitlist) {
		return waitlist.poll();
	}

}
