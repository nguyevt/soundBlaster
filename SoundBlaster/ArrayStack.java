// Vincent Nguyen, CSE 373, WIN2014
// Assignment #1, 01/15/14
//
// This program's behavior is to provide a stack implementation
// using an array. It implements the DStack interface and
// contains the common behaviors of a stack such as: push(),
// pop(), isEmpty(), and peek().

import java.util.EmptyStackException;

public class ArrayStack implements DStack {
	
	private int length;
	private double[] values;
	
	// Constructs a new ArrayStack
	public ArrayStack() {
		this.length = 0;
		values = new double[10];
	}
	
	// Returns true if ArrayStack is empty, returns false
	// otherwise
	public boolean isEmpty() {
		if (length == 0) {
			return true;
		}
		return false;
	}
	
	// Adds another double value to the top of the stack and 
	// increases the length of the stack by 1. Also resizes the 
	// stack to accommodate more values if full.
	public void push(double d) {
		if (length >= values.length) {
			double[] temp = new double[values.length * 2];
			for (int i = 0; i < values.length; i++) {
				temp[i] = values[i];
			}
			values = temp;
		}
		values[length] = d;
		length++;
	}
	
	// Returns an EmptyStackException() if the stack is empty.
	// Otherwise it removes and returns the first value
	// on the top of the stack.
	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else if (length <= values.length * 1 / 4) {
			double[] temp = new double[values.length / 2];
			for (int i = 0; i < values.length * 1 / 4; i++) {
				temp[i] = values[i];
			}
			values = temp;
		}
		length--;
		return values[length];
	}
	
	// Returns an EmptyStackException() if the stack is empty.
	// Otherwise it returns the first value on the top of the
	// stack
	public double peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return values[length - 1];
	}
}
