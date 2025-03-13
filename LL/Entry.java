package org.cdac.utils;

public class Entry {

	public static void main(String[] args) {
		LinkedList objList = new LinkedList();
		objList.add("He");
		objList.add(1);
		objList.add('N');
		objList.add(1.02);
		
		objList.displayLL();
		
		System.out.println("First node data "+ objList.getFirst());
		System.out.println("Last node data "+ objList.getLast());
	}

}
