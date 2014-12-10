package com.test.quovantis.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * without using any other class Collection
 */
public class ConvertToSet {

	public static void main(String... args) {
		List<Integer> lst = Arrays.asList(9, 3, 54, 2, 45, 6, 4, 2, 4, 65, 6,
				6, 4, 3, 2, 2, 4, 5, 6, 7, 2);
		Set<Integer> set1 = new HashSet<Integer>(lst);
		/*
		 * or
		 */
		Set<Integer> set = new TreeSet<Integer>(lst);
		set.addAll(lst);
		System.out.println(set);
	}
}
