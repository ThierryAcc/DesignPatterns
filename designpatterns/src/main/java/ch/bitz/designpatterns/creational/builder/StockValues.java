package ch.bitz.designpatterns.creational.builder;

public enum StockValues {
	EURO(1), GOLD(1583.17f), OIL(19.19f), ACCENTURE(162.34f), MICROSOFT(163.26f), IBM(116.40f);

	private float value;
	
	StockValues(float d) {
		this.value = d;
	}

	public float getValue() {
		return value;
	}

}
