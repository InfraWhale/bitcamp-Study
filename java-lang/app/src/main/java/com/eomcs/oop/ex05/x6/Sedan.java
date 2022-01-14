package com.eomcs.oop.ex05.x6;

public class Sedan extends Car {

	boolean auto;
	boolean openedSunroof;

	@Override
	public void run() {
		System.out.println("세단 부아아아앙!");
	}

	public void openSunroof() {
		System.out.println("세단 선루프 열어!");
		this.openedSunroof = true;
	}

	public void closeSunroof() {
		System.out.println("세단 선루프 닫어!");
		this.openedSunroof = false;
	}

}
