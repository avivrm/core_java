package com.test.quovantis.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyList {

	public static void main(String... str) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(11);
		lst.add(12);
		lst.add(13);
		lst.add(14);
		lst.add(15);
		lst.add(16);
		lst.add(17);
		lst.add(18);
	/*	lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);
		lst.add(18);*/

		System.out.println("List : " + lst.size());

		List<Integer> lst1 = new ArrayList<Integer>(lst.size());
		Collections.copy(lst1,lst);
		System.out.println("lst1 : " + lst1);

	}
}
