package com.thiskeyword;

public class Box {

	int length;
	int width;
	int height;

	public void calVolume() {
		int volume = length * width * height;
		System.out.println("Volume of the box: " + volume);
	}

}
