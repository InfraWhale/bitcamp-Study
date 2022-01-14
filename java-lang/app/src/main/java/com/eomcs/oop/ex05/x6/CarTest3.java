package com.eomcs.oop.ex05.x6;

public class CarTest3 {

	public static void main(String[] args) {

		Sedan sedan = new Sedan();

		SnowChain snow = new SnowChain(sedan);

		testCar(snow);

		System.out.println("------------------------------------------------");

		Truck truck = new Truck();

		BlackBox black = new BlackBox(truck);

		testCar(black);

		System.out.println("------------------------------------------------");

		SUV suv = new SUV();

		SnowChain snowChainSuv = new SnowChain(suv);
		BlackBox blackSnowSuv = new BlackBox(snowChainSuv);

		testCar(blackSnowSuv);

	}

	static void testCar(Car car) {
		car.start();
		car.run();
		car.stop();
	}




}


