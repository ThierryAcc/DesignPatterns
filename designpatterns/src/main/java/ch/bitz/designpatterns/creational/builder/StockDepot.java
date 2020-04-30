package ch.bitz.designpatterns.creational.builder;

public class StockDepot {
	private final String firstname;
	private final String lastname;
	private final String street;
	private final String city;
	private final String postcode;

	private final float euro;
	private final float gold;
	private final float oil;
	private final int accenture;
	private final int microsoft;
	private final int ibm;

	public static class StockDepotBuilder {
		private String firstname;
		private String lastname;
		private String street;
		private String city;
		private String postcode;
		private float euro;
		private float gold;
		private float oil;
		private int accenture;
		private int microsoft;
		private int ibm;

		public StockDepotBuilder(String firstname, String lastname, String street, String city, String postcode) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.street = street;
			this.city = city;
			this.postcode = postcode;
		}

		public StockDepotBuilder setEuro(float euro) {
			this.euro = euro;
			return this;
		}

		public StockDepotBuilder setGold(float gold) {
			this.gold = gold;
			return this;
		}

		public StockDepotBuilder setOil(float oil) {
			this.oil = oil;
			return this;
		}

		public StockDepotBuilder setMicrosoft(int microsoft) {
			this.microsoft = microsoft;
			return this;
		}

		public StockDepotBuilder setIbm(int ibm) {
			this.ibm = ibm;
			return this;
		}
		
		public StockDepotBuilder setAccenture(int accenture) {
			this.accenture = accenture;
			return this;
		}

		public StockDepot build() {
			return new StockDepot(firstname, lastname, street, city, postcode, euro, gold, oil, accenture, microsoft, ibm);
		}
	}

	

	public StockDepot(String firstname, String lastname, String street, String city, String postcode, float euro,
		float gold, float oil, int accenture, int microsoft, int ibm) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
		this.euro = euro;
		this.gold = gold;
		this.oil = oil;
		this.accenture = accenture;
		this.microsoft = microsoft;
		this.ibm = ibm;
	}

	@Override
	public String toString() {
		return "StockDepot " + lastname + "\n----------\nEuro=" + euro + "\nGold=" + gold + " \nOil=" + oil
				+ " \nAccenture=" + accenture + " \nMicrosoft=" + microsoft + " \nIbm=" + ibm
				+ "\n----------"
				+ "\nTotal in EUR:" + calcValue();
	}

	public float calcValue() {
		return 	euro * StockValues.EURO.getValue() 
				+ gold * StockValues.GOLD.getValue()
				+ oil * StockValues.OIL.getValue()
				+ accenture * StockValues.ACCENTURE.getValue()
				+ microsoft * StockValues.MICROSOFT.getValue()
				+ ibm * StockValues.IBM.getValue();
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostcode() {
		return postcode;
	}

	public float getEuro() {
		return euro;
	}

	public float getGold() {
		return gold;
	}

	public float getOil() {
		return oil;
	}

	public int getAccenture() {
		return accenture;
	}

	public int getMicrosoft() {
		return microsoft;
	}

	public int getIbm() {
		return ibm;
	}

}
