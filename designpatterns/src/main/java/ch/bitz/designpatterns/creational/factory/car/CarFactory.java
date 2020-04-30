package ch.bitz.designpatterns.creational.factory.car;

// Verwendung und Erstellung des Objektes wird getrennt
public class CarFactory {

	// keine Instanz davon
	private CarFactory() {}

	// FLEXIBILITÄT WELCHES AUTO ZU BAUEN IST
	public static Car build(String arg) {
		switch (arg) {
		case "BMW":
			return new BMWCar();
		case "Porsche":
			return new PorscheCar();
		case "Tesla":
			return new TeslaCar();
		default:
			return null;
		}
	}
}
