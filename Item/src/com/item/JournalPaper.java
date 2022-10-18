package com.item;


class JournalPaper extends WrittenItem {
	private int publishYear;

	public JournalPaper() { // constructor
		super();
	}

	//setter and getter
	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}


}
