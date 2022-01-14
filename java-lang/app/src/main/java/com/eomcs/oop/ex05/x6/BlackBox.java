package com.eomcs.oop.ex05.x6;

public class BlackBox extends Option {

	public BlackBox(Car car) {
		super(car); // 카 객체를 받아 슈퍼클래스에 전달
	}

	@Override
	public void run() {
		car.run();
	}

	@Override
	public void start() {
		super.start();
		System.out.println("녹화 시작!");
	}
	@Override
	public void stop() {
		super.stop();
		System.out.println("녹화 종료!");
	}

}
