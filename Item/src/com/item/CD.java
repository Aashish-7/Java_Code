package com.item;

class CD extends MediaItem {
	private String artist;
	private String genre;

	//constructor
	public CD() {
		super();
	}

	//setter and getter
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


}