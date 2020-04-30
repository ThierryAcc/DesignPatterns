package ch.bitz.designpatterns.structural.adapter;

public class PorscheCar implements NewCar{

	@Override
	public void start() {
		System.out.println("Porsche start");		
	}

	@Override
	public void drive() {
		System.out.println("Porsche drive");
	}

	@Override
	public void stop() {
		System.out.println("Porsche stop");
	}

}
