package ch.bitz.designpatterns.structural.adapter;

public class MantaCar implements OldCar{

	@Override
	public void warmUp() {
		System.out.println("manta warming");		
	}

	@Override
	public void starter() {
		System.out.println("manta starter");
	}

	@Override
	public void start() {
		System.out.println("manta start");
	}

	@Override
	public void gear() {
		System.out.println("manta gear");
	}

	@Override
	public void drive() {
		System.out.println("manta drive");
		
	}

	@Override
	public void stop() {
		System.out.println("manta stop");
	}

}
