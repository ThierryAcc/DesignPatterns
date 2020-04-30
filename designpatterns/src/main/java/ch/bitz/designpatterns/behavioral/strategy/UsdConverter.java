package ch.bitz.designpatterns.behavioral.strategy;

public class UsdConverter implements CurrencyConverter {

	@Override
	public double convert(double input) {
		return input * (1 / 0.92);
	}

}
