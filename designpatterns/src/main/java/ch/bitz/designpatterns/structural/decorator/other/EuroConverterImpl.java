package ch.bitz.designpatterns.structural.decorator.other;

public class EuroConverterImpl implements EuroConverter {

	// falls dieses Ding in einem Package ist, dass ich nicht
	// bearbeiten kann
	@Override
	public float convert(float usd) {
		return usd * 0.92f;
	}

}
