package ch.bitz.designpatterns.structural.decorator;

import ch.bitz.designpatterns.structural.decorator.other.Calculator;
import ch.bitz.designpatterns.structural.decorator.other.EuroConverter;
import ch.bitz.designpatterns.structural.decorator.other.EuroConverterImpl;

public class Main {
public static void main(String[] args) {
	EuroConverter euroConverter = new EuroConverterImpl();
	System.out.println(euroConverter.convert(1000));
	
	euroConverter = new EuroConverterDecorator(euroConverter);
	
	Calculator calculator = new Calculator(euroConverter);
	calculator.calc(12f,  14f);
}
}
