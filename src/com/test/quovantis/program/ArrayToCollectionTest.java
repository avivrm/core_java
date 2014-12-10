package com.test.quovantis.program;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayToCollectionTest {
	private static final Logger logger = LoggerFactory
			.getLogger(ArrayToCollectionTest.class);

	public static void main(String args[]) {

		// Converting String array to Collection, Set and List in Java
		String[] operatingSystems = new String[] { "Windows", "Linux",
				"Android", "iOS", "Solaris" };

		logger.info("Elements in array : {}", Arrays.toString(operatingSystems));

		// Convert array to Collection in Java
		Collection collection = Arrays.asList(operatingSystems);
		logger.info("Objects in collection : {},", collection);

		// Convert String array to Set in Java
		Set set = new HashSet(Arrays.asList(operatingSystems));
		logger.info("Elements in Set : {},", set);

		// Convert String array to List in Java
		List list = Arrays.asList(operatingSystems);
		logger.info("List created from Array in Java : {}", list);

		// Converting Integer array to Collection, List and Set in Java
		Integer[] scores = new Integer[] { 101, 201, 301, 401 };
		logger.info("Contents of Integer array : {}", Arrays.toString(scores));

		// Creating Collection from Integer array in Java
		Collection iCollection = Arrays.asList(scores);
		logger.info("Java Collection created from Integer array: {}",
				iCollection);

		// Creating List form Integer array in Java
		List iList = Arrays.asList(scores);
		logger.info("List created from integer array : {}", iList);

		// Example of Converting Integer array to HashSet in Java
		Set iSet = new HashSet(iList);
		logger.info("Integer array to Set in Java {}", iSet);
	}

}
