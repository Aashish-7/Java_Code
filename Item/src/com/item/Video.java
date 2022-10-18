package com.item;

class Video extends MediaItem {
	private String director;
	private String genre;
	private int releaseYear;

	//constructor
	public Video() { // constructor
		super();
	}

	//setter and getter
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}



}