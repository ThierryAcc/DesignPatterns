package ch.bitz.designpatterns.behavioral.strategy;

public class EurConverter implements CurrencyConverter {

	@Override
	public double convert(double input) {
		return input * 0.92;

	}
}
