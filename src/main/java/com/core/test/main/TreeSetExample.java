package com.core.test.main;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String... strings) {
		Set<Book> tree = new TreeSet<Book>();
		tree.add(null);
		tree.add(new Book("zhjg"));
		tree.add(new Book("bgfg"));
		tree.add(new Book("njgjh"));
		tree.add(new Book("rtyr"));
		tree.add(new Book("ljkj"));
		tree.add(new Book("sddf"));
		
		for(Book e:tree){
            System.out.println(e);
        }
	}
}
