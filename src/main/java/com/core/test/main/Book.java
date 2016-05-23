package com.core.test.main;

public class Book implements Comparable<Book>{

	private String title;
	
	Book(String title){
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	@Override
	public int compareTo(Book o) {
		return this.title.compareToIgnoreCase(o.getTitle());
	}
	@Override
	public String toString(){
		return this.title;
	}
	
}
