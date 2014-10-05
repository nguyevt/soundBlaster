// Vincent Nguyen, CSE 373, WIN2014
// Assignment #1, 01/15/14
//
// This program's behavior is to provide ListStackNode intended
// to be used with the ListStack class, implementing a stack using
// a list.


public class ListStackNode {
	
	public ListStackNode next;
	public double value;

	// Client provides a double value and a ListStackNode
	// Creates a new ListStackNode using the provided parameters
	public ListStackNode(double value, ListStackNode next) {
		this.value = value;
		this.next = next;
	}
}