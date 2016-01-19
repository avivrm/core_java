package com.core.cci.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

	private Node<T> head;
	
	private int length;

	public void removeDuplicate() {
		Node<T> temp = head;
		List<T> unqiueValues = new ArrayList<T>();
		while(null != temp) {
			if(!unqiueValues.contains(temp.getValue())) {
				unqiueValues.add(temp.getValue());
			}
			temp = temp.getNextNode();
		}
		prepareLinkedList(unqiueValues);
	}
	
	public Node<T> prepareLinkedList(T[] values) {
		if(null == values || values.length == 0) {
			head = null;
		} else {
			length = values.length;
			head = new Node<T>(values[0], null);
			Node<T> temp = head;
			for(int i = 1; i < values.length; i++) {
				Node<T> node = new Node<T>(((T)values[i]), null);
				temp.setNextNode(node);
				temp = node;
			}
		}
		return head;
	}
	
	public Node<T> prepareLinkedList(List<T> values) {
		return prepareLinkedList(((T[])values.toArray()));
	}
	
	public Node<T> prepareLinkedList(Integer value) {
		Integer digit = 0;
		Node<T> temp = head;
		Node<T> next;
		while(value != 0) {
			digit = value%10;
			value = value/10;
			if(null == head) {
				head = (Node<T>) new Node<Integer>(digit, null);
				temp = head;
			} else {
				next = (Node<T>) new Node<Integer>(digit, null);
				temp.setNextNode(next);
				temp = temp.getNextNode();
			}
		}
		return head;
	}

	public int getValue() {
		if(null == head) {
			return 0;
		}
		
		int value = 0;
		Node<T> temp = head;
		int multiplicationFactor = 1;
		while(null != temp) {
			value = ((Integer)temp.getValue() * multiplicationFactor) + value;
			temp = temp.getNextNode();
			multiplicationFactor *= 10;
		}
		return value;
	}
	
	public void displayLinkedList() {
		if(null == head) {
			return;
		}
		System.out.println("\n");
		Node<T> temp = head;
		while(null != temp) {
			System.out.print(temp.getValue());
			if(null != temp.getNextNode()) {
				System.out.print(" --> ");
			}
			temp = temp.getNextNode();
		}
	}

	public Node<T> getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}
	
	/*public int length() {
		if(null == head) {
			return 0;
		}
		Node<T> temp = head;
		int length = 0;
		for(;null != temp;temp = temp.getNextNode(),length++);
		return length;
	}*/

}

