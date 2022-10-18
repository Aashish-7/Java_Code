package com.item;

abstract class MediaItem extends Item {
	private int runTime;

//setter and getter
	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

}