package main.java;

public class Generics {

	public void run() {
		//intialize the list
		Integer[] list = new Integer[] {10,3,26,67,43};
		
		//find the greates element
		Integer greatest = greatestElement(list);
		
		System.out.println("Greatest element: " + greatest);
	}

	public <T extends Comparable<T>> T greatestElement(T[] elements) {
		T greatest = elements[0];
		for(T t:elements) {
			if(t.compareTo(greatest) > 0) {
				greatest = t;
			}
		}
		return greatest;
	}

}
