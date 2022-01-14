package com.eomcs.oop.ex05.x7;

public class CarTest {

	public static void main(String[] args) {

	}

	public void tryCar(Car car) {
		car.start();
		car.run();
		if (car instanceof Truck) {
			((Truck) car).dump();
		}
		car.stop();
	}

}
