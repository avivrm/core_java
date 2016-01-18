package com.test.core.cci.linkedlist;

public class LinkedListSum {

	public static void main(String[] args) {
		LinkedList<Integer> linkedListInteger1 = new LinkedList<Integer>();
		linkedListInteger1.prepareLinkedList(7735);
		linkedListInteger1.displayLinkedList();
		int value1 = linkedListInteger1.getValue();
		System.out.println("\n" + value1);
		
		LinkedList<Integer> linkedListInteger2 = new LinkedList<Integer>();
		linkedListInteger2.prepareLinkedList(3375);
		linkedListInteger2.displayLinkedList();
		int value2 = linkedListInteger2.getValue();
		System.out.println("\n" + value2);
		
		LinkedList<Integer> linkedListSum = new LinkedList<Integer>();
		linkedListSum.prepareLinkedList(value1 + value2);
		linkedListSum.displayLinkedList();
		System.out.println("\n" + linkedListSum.getValue());
	}
}
