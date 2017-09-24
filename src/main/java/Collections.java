package main.java;

import java.util.HashSet;

public class Collections {

	public void run() {
		HashSet<String> numbers = new HashSet<>();
		
		//Adding number to set
		addNumberToSet("9999999999", numbers);
		
		System.out.println("Set after adding first number: " + numbers);
		
		//Adding duplicate number to set
		addNumberToSet("9999999999", numbers);
		
		System.out.println("Set after adding duplicate number: " + numbers);
		
		//Adding another new number
		addNumberToSet("9291929192", numbers);
		
		System.out.println("Set after adding another new number: " + numbers);
	}

	public void addNumberToSet(String number, HashSet<String> numbers) {
		numbers.add(number);
	}
	
}
