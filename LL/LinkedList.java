package org.cdac.utils;

public class LinkedList {
	Node start;
	Node end;
	Node current;
	int maxCount;
	
	public void add(Object data) {
		Node tmpNode = new Node(data);
		
		if (start == null)
			start = end = current = tmpNode;
		else {
			end.next = tmpNode;
			tmpNode.previous = end;
			end = tmpNode;
		}
		
		maxCount++;
	}
	
	Object getFirst() {
		if (start == null)
			return null;
		current = start;
		return current.data;
	}
	
	Object getLast() {
		if (end == null)
			return null;
		current = end;
		return current.data;
	}
	
	Object getNext() {
		if (current.next == null)
			return null;
		else {
			current = current.next;
			return current.data;
		}
	}
	
	Object getPrevious() {
		if (current.previous == null)
			return null;
		else {
			current = current.previous;
			return current.data;
		}
	}
	
	public void displayLL() {
		if (start == null) 
			System.out.println("Linked list is empty!");
		else {
			current = start;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
 }
