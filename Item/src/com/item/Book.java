package com.item;

class Book extends WrittenItem {

	public Book() { // constructor same as class name
		super();
	}

	public Book(int identityNumber, String title) {
		System.out.println("com.item.Book");
	}
}