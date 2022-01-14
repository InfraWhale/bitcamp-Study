package com.eomcs.oop.ex05.x6;

public class SUV extends Car {

	boolean enabled4WD;

	//	public void active4WD () {
	//		System.out.println("4WD 활성화!");
	//
	//		if (enabled4WD == true) {
	//			System.out.println("4WD 활성화!");
	//			enabled4WD = false;
	//		} else {
	//			System.out.println("4WD 활성화!");
	//			enabled4WD = true;
	//		}
	//	}

	@Override
	public void run() {
		if (enabled4WD) {
			System.out.println("강력한 파워로 달린다!");
		} else {
			System.out.println("그냥 달린다!");
		}
	}

	public void active4WD (boolean enable) {
		this.enabled4WD = enable;
	}

	//	public void active4WD () {
	//		System.out.println("4WD 활성화!");
	//
	//		if (enabled4WD == true) {
	//			System.out.println("4WD 활성화!");
	//			enabled4WD = false;
	//		} else {
	//			System.out.println("4WD 활성화!");
	//			enabled4WD = true;
	//		}
	//	}

}
