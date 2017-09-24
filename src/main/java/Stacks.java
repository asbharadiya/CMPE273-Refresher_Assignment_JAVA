package main.java;

import java.util.Stack;

public class Stacks {

	public void run() {
		Stack<String> stack = new Stack<>();
		
		//Adding letters typed from the keyboard
		addLetterToStack("A", stack);
		addLetterToStack("N", stack);
		addLetterToStack("K", stack);
		addLetterToStack("I", stack);
		addLetterToStack("T", stack);
		
		System.out.println("Stack: " + stack);
		
		//Removing the last letter on delete key press once
		removeFromStack(stack);
		
		System.out.println("Stack after pressing delete key once: " + stack);
		
		//clearing stack
		stack.clear();
		
		System.out.println("Stack after clearing: " + stack);
	}

	public String removeFromStack(Stack<String> stack) {
		return stack.pop();
	}

	public void addLetterToStack(String letter, Stack<String> stack) {
		stack.push(letter);
	}
	
}
