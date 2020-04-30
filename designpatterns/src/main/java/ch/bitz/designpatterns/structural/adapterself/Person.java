package ch.bitz.designpatterns.structural.adapterself;

public class Person {
	private DVD dvd;

	public Person(DVD dvd) {
		this.dvd = dvd;
	}
	
	public void watch() {
		this.dvd.play();
		this.dvd.eject();
	}
	
	// man könnte es nur mit VIDEO und DVD bauen
	public static void main(String[] args) {
		Person a = new Person(new GodfatherDVD());
		a.watch();
		
		System.out.println();
		Person b = new Person(new Video2DVDAdapter(new GodfatherVideo()));
		b.watch();
	
		Video2DVDAdapter v2a = new Video2DVDAdapter(new GodfatherVideo());
		v2a.eject();
		
	}
	

}
