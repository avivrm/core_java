package com.ds.cci.linnkedlist;

/**
 * @author avinashve
 *
 */
public class PrintLinkedListMain {

	public static void main(String[] args) {
		int[] intArr = {6,4,6,7,45,3};
		LinkedList linkedList = new LinkedList();
		linkedList.createLinkedList(intArr);
		linkedList.reverse();
		System.out.println(linkedList.toString());
	}
}
