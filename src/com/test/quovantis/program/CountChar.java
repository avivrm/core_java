package com.test.quovantis.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountChar {

	public static void main(String... strings) {
		String str = "i am avinash";
		char[] charArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArr) {
			if (c == ' ')
				continue;
			int count = 0;
			if (map.containsKey(c)) {
				int val = map.get(c);
				map.put(c, val + 1);
			} else {
				map.put(c, count);
			}
		}
		Set<Character> keys = new TreeSet<Character>(map.keySet());
		for (Character c : keys) {
			System.out.println("key : " + c + " " + " value :" + map.get(c)
					+ "\n");
		}
	}
}
