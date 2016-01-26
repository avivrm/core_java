package com.ds.cci.linnkedlist;

public class LinkedList {
	
	private Node head;
	private int size;
	
	static String seprator = " --> ";

	LinkedList(){
		// No Initialization
	}
	
	public void createLinkedList(int[] arr){
		int counter = 0;
		//Node temp = null;
		while(counter < arr.length){
			Node newNode = new Node();
			newNode.setVal(arr[counter]);
			if(head == null){
				head = newNode;
				//temp = head;
			}else{
				Node node = head;
				for(int i=0 ;i<counter;i++){
						if(i == counter-1){
							node.setNext(newNode);
						}else{
							node = node.getNext();
						}
				}
			}
			counter++;
		}
		size = counter;
	}
	
	public void reverse(){
		Node node = head;
		Node temp = null;
		for(int i=0;i<size;i++){
			Node newNode = node;
			node = node.getNext();
			newNode.setNext(temp);
			temp = newNode;		
		}
		head = temp;
	}
	
	public Node reverse(Node node,int counter){
		Node current = node;
		Node temp = null;
		for(int count=0;count < counter && current != null ;count++){
			Node newNode = current;
			current = current.getNext();
			newNode.setNext(temp);
			temp = newNode;
		}
		
		if(current != null){
			node.setNext(reverse(current,counter));
		}
		return temp;
	}
	
	public String toString(){
		Node node = head;
		StringBuilder str = new StringBuilder();
		while(node.getNext() != null){
			str.append(node.getVal() + LinkedList.seprator);
			node = node.getNext();
		}
		str.append(node.getVal());
		return str.toString();
		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
