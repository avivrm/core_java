package com.ds.cci.linnkedlist;

public class Node {
	private int val;
	private Node next;

	public Node() {
		val = 0;
		next = null;
	}

	public Node(int v, Node n) {
		val = v;
		next = n;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
}
