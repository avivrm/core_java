package com.test.core.cci.linkedlist;

public class Node<T> {

	public Node() {
		
	}
	public Node(T value) {
		this.value = value;
	}
	public Node(T value, Node<T> nextNode) {
		this(value);
		this.nextNode = nextNode;
	}
	private T value;
	private Node<T> nextNode;
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
}
