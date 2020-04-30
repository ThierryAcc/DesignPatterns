package ch.bitz.designpatterns.structural.decorator;

import ch.bitz.designpatterns.structural.decorator.other.EuroConverter;

// fügt funktionen zu EuroConverterImpl ohne diesen zu modifizieren
// manchmal nützlich wenn man Klassen nicht modifizieren kann
// aber das Verhalten angepasst werden muss
// packete auf die ich keinen Zugriff habe
// oder andere Funktionalität nicht beeinflussen
public class EuroConverterDecorator implements EuroConverter {

	EuroConverter euroConverter;
	
	public EuroConverterDecorator(EuroConverter euroConverter) {
		super();
		this.euroConverter = euroConverter;
	}

	@Override
	public float convert(float usd) {
		System.out.println("start conversion");
		float result = euroConverter.convert(usd);
		System.out.println("stop conversion");
		return result;
	}

}
