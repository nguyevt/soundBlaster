// Vincent Nguyen, CSE 373, WIN2014
// Assignment #1, 01/15/14
//
// This program's behavior is to provide a stack implementation
// using a list. It implements the DStack interface and
// contains the common behaviors of a stack such as: push(),
// pop(), isEmpty(), and peek().

import java.util.EmptyStackException;

public class ListStack implements DStack {

	private ListStackNode front;
	
	// Constructs a new ListStack
	public ListStack() {
    	this.front = null; 
	}

	// Returns true if the ListStack is empty and false otherwise
	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}

	// Adds another double value onto the top of the stack and
	// increaes the length of the stack by 1.
	public void push(double d) {
		front = new ListStackNode(d, front);
	}
  
	// Returns an EmptyStackException() if the stack is empty.
	// Otherwise returns the first value on the top of the stack.
	public double peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return front.value;
	}
  
	// Returns an EmptyStackException() if the stack is empty.
	// Otherwise removes and returns the first value on top of 
	//the stack.
	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		double temp = front.value;
		front = front.next;
		return temp;
	}
}
