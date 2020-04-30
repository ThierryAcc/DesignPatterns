package ch.bitz.designpatterns.structural.adapter;

// mappe die methoden von dem neuen Interface auf das
// alte interface
public class OldCarAdapter implements NewCar {

	// dependency auf das Interface von dem MantaCAr OldCar
	OldCar car;
	
	public OldCarAdapter(OldCar car) {
		super();
		this.car = car;
	}

	@Override
	public void start() {
		car.warmUp();
		car.starter();
		car.start();
	}

	@Override
	public void drive() {
		car.gear();
		car.drive();
	}

	@Override
	public void stop() {
		car.stop();
	}

}
