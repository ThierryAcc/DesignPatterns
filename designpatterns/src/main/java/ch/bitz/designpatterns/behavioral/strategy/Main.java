package ch.bitz.designpatterns.behavioral.strategy;

public class Main {
	static EurConverter eurConverter = new EurConverter();
	static UsdConverter usdConverter = new UsdConverter();

	CurrencyConverter currencyConverter;

	// Strategie, wird über DI festgelegt
	public Main(CurrencyConverter currencyConverter) {
		super();
		this.currencyConverter = currencyConverter;
	}

	public void calc(double input) {
		System.out.println("result " + currencyConverter.convert(input));
	}

	public static void main(String[] args) {
		double result = 0;
		double input = 1000;

		if ("usd".equals(args[0])) {
			result = usdConverter.convert(input);
		} else {
			result = eurConverter.convert(input);
		}

		System.out.println(result);

		CurrencyConverter currencyConverter;

		if ("usd".equals(args[0])) {
			currencyConverter = new UsdConverter();
		} else {
			currencyConverter = new EurConverter();
		}

		// dynamischer Typ
		Main main = new Main(currencyConverter);
		main.calc(input);
	}
}
