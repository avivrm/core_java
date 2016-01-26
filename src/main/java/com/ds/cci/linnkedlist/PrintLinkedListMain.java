package com.ds.cci.linnkedlist;

/**
 * @author avinashve
 *
 */
public class PrintLinkedListMain {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		LinkedList linkedList = new LinkedList();
		linkedList.createLinkedList(intArr);
		Node node = linkedList.reverse(linkedList.getHead(),3);
		linkedList.setHead(node);
		System.out.println(linkedList.toString());
	}
}
