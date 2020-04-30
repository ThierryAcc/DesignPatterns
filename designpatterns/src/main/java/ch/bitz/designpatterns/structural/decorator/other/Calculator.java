package ch.bitz.designpatterns.structural.decorator.other;

public class Calculator {
	EuroConverter euroConverter;
	
	public Calculator(EuroConverter euroConverter) {
		this.euroConverter = euroConverter;
	}

	public void calc(float f1, float f2) {
		float ea = euroConverter.convert(f1);
		float eb = euroConverter.convert(f2);
		System.out.println(ea + eb);
	}
}
