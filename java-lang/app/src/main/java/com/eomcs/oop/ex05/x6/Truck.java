package com.eomcs.oop.ex05.x6;

public class Truck extends Car {

	int weight;

	@Override
	public void run() {
		// 기존에 이이 있는 메서드를 호출한다.
		this.go();
	}

	@Override
	public void start() {
		// 기존에 이이 있는 메서드를 호출한다.
		this.launch();
	}

	@Override
	public void stop() {
		// 기존에 이이 있는 메서드를 호출한다.
		this.stopping();
	}

	public void launch() {
		System.out.println("트럭 히히 점심시간이다!");
	} // 그대로

	public void stopping() {
		System.out.println("트럭 으앙 쥬금!");
	} // 그대로

	public void go() {
		System.out.println("트럭 부엉부엉부엉이!");
	}

	public void dump() {
		System.out.println("트럭 짐내려!");
	}

}
