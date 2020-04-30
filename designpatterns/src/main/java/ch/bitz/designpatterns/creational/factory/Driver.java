package ch.bitz.designpatterns.creational.factory;

import ch.bitz.designpatterns.creational.factory.car.Car;

public class Driver {
	
	// dependency injection
	// car ist eine Abhängigkeit dass der Driver hat
	Car car;
	public Driver(Car car) {
		this.car = car;
	}

	public void useCar() {
		System.out.println("Start driving");
		car.drive();
	}
}
