package ch.bitz.designpatterns.creational.factory.car;

public class TeslaCar implements Car {

	@Override
	public void drive() {
		System.out.println("drive umweltfreundlich");
	}

}
