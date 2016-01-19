package com.core.cci.linkedlist.reverse;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	
	@Test
    public void testReverse() {
		Integer[] decimalNodes = new Integer[]{1, 2, 3, 4, 5};
		LinkedList<Integer> linkedList = new LinkedList<Integer>(decimalNodes);
		linkedList.reverse();
		Assert.assertEquals(new Integer[]{5, 4, 3, 2, 1}, decimalNodes);
    }
	
}
