package com.eomcs.oop.ex05.x7;

public class Sedan extends Car {

	boolean openedSunroof;
	boolean auto;


	@Override
	public void run() {
		System.out.println("세단이 달린다");
	}

	public void openSunroof() {
		this.openedSunroof = true;
	}

	public void closeSunroof() {
		this.openedSunroof = false;
	}

}
