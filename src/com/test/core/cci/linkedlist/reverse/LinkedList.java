package com.test.core.cci.linkedlist.reverse;

public class LinkedList<T> {
	
	private Node<T> head = null;

	public LinkedList(T[] nodes) {
		createList(nodes);
	}

	@SuppressWarnings("unchecked")
	private Node<T>[] getNodeList(T[] nodeList) {
		Node<T>[] nodes = new Node[nodeList.length];
		for(int i = 0; i < nodeList.length; i++) {
			nodes[i] = new Node<T>(nodeList[i]);
		}
		return nodes;
	}

	public void createList(T[] nodeList) {
		if(null == nodeList || nodeList.length == 0) {
			System.out.println("creating EMPTY linked list.");
			return;
		}
		Node<T>[] nodes = getNodeList(nodeList);
		head = nodes[0];
		Node<T> node = null;
		for(int i = 1; i < nodes.length; i++) {
			node = nodes[i-1];
			node.setNext(nodes[i]);
		}
		Node<T> lastNode = node.getNext();
		lastNode.setNext(null);
	}
	
	public void reverse(int limit) {
		head = (limit > 0) ? reverse(limit, head) : reverse(); 
	}
	
	private Node<T> reverse(int limit, Node<T> head) {
		if(null == head) {
			return null;
		}
		Node<T> previous = null; 
		Node<T> current = head;
		Node<T> next = head.getNext();
		int counter = 0;
		while(null != current && counter++ < limit) {
			current.setNext(previous);
			previous = current;
			current = next;
			if(null != next) {
				next = next.getNext();
			}
		}
		head.setNext(reverse(limit, current));
		return previous;
	}
	
	public Node<T> reverse() {
		if(null == head) {
			return null;
		}
		Node<T> previous = null; 
		Node<T> current = head;
		Node<T> next = head.getNext();
		while(null != current) {
			current.setNext(previous);
			previous = current;
			current = next;
			if(null != next) {
				next = next.getNext();
			}
		}
		head = previous;
		return head;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		if(null == head) {
			return "EMPTY LIST.";
		}
		Node<T> node = head;
		while(null != node) {
			str.append(node.getData());
			if(null != node.getNext()) {
				str.append("->");
			}
			node = node.getNext();
		}
		return str.toString();
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
}
