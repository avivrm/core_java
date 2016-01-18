package com.test.core.maptest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class MapTest {

	public static void main(String[] args) {
		List<Pattern> patterns = new ArrayList<Pattern>();
		int size = 10000;
		Map<Pattern, Integer> testMap = new HashMap<Pattern, Integer>();
		for(int i = 0; i < size; i++) {
			Pattern pattern = Pattern.compile("" + 1);
			patterns.add(pattern);
			testMap.put(pattern, i);
		}
		List<Integer> ints = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			ints.add(testMap.get(patterns.get(1)));
		}
		
		for(int i = 1; i < size; i++) {
			if(ints.get(i) < ints.get(i - 1)) {
				System.out.println("BROKEN");
				break;
			} else {
				System.out.println(ints.get(i));
			}
		}
	}
}
