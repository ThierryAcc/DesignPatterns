package ch.bitz.designpatterns.creational.builder;

// immutable Class, z.B. StringBuilder
public class Person {
	private final String firstname;
	private final String lastname;
	private final int age;
	private final String postcode; // optionals Feld

	// was wenn diese Klasse 20 Felder hat?
	// unleserlicher Code

	
	// VERSION 1 MIT INNER KLASSE UND PERSONENBUILDER
	// ARBEITE MIT SETTERN WEIL DIE INNEREN FELDER NICHT FINAL SIND
	public static class PersonBuilder {
		private String firstname;
		private String lastname;
		private int age;
		private String postcode;
		
		public PersonBuilder(String firstname, String lastname, int age) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
		}

		// GIB DEN BUILDER ZURÜCK	
		public PersonBuilder setPostcode(String postcode) {
			this.postcode = postcode;
			return this;
		}

		// NUTZE DEN PRIVATE SETTER
		public Person build() {
			return new Person(firstname, lastname, age);
		}
	}

	// mit optionalen Feldern wird es sehr schnell unübersichtlich
	// mit einem Builder ist das viel einfacher!!!
	private Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.postcode = "";
	}
	
	private Person(String firstname, String lastname, int age, String postcode) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.postcode = postcode;
	}
	
	
//	public Person(String firstname, String lastname, int age) {
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.age = age;
//	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public String getPostcode() {
		return postcode;
	}
	
}
