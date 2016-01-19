package com.core.cci.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import com.core.cci.linkedlist.LinkedList;

public class LinkedListTest {
	
	@Test
    public void testReverse() {
		Integer[] decimalNodes = new Integer[]{1, 2, 3, 4, 5};
		LinkedList<Integer> linkedList = new LinkedList<Integer>(decimalNodes);
		linkedList.reverse();
		Integer[] expectedNodes = {5, 4, 3, 2, 1};
		LinkedList<Integer> expectedLinkedList = new LinkedList<Integer>(expectedNodes);
		Assert.assertEquals(expectedLinkedList.toString(), linkedList.toString());
    }
	
}
