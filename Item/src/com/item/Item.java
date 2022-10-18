package com.item;

public abstract class Item {

	private int uniqueIdNo;
	private String title;
	private int numberOfCopies;
	
	//  Constructor
	public Item() {
		System.out.println("com.item.Item number is :" + uniqueIdNo);
	}

	// Constructor with param
	public Item(int uniqueIdNo, int numberOfCopies, String title) {
		System.out.println("Constructor with param");
	}


	//now setter and getter method
	public int getUniqueIdNo() {
		return uniqueIdNo;
	}

	public void setUniqueIdNo(int uniqueIdNo) {
		this.uniqueIdNo = uniqueIdNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}




	@Override
	public String toString() {
		return "Item [uniqueIdNo=" + uniqueIdNo + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}

	//methods for checkin &checkout
	public void checkIn() {
		numberOfCopies += 1;
	}

	public void checkOut() {
		numberOfCopies -= 1;
	}
}