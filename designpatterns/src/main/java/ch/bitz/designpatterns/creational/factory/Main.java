package ch.bitz.designpatterns.creational.factory;

import ch.bitz.designpatterns.creational.factory.car.BMWCar;
import ch.bitz.designpatterns.creational.factory.car.CarFactory;

public class Main {
	public static void main(String[] args) {
		Driver driver = new Driver(new BMWCar());
		driver.useCar();
		
		Driver driver2 = new Driver(CarFactory.build("Porsche"));
		driver2.useCar();
		
		Driver driver3 = new Driver(CarFactory.build("Tesla"));
		driver3.useCar();
	}
}
