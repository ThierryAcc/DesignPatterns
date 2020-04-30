package ch.bitz.designpatterns.creational.singleton;

// EAGER - static. Wird immer mit der Klasse geladen
public class EagerSingleton {
	// has to create the instance
	private static final EagerSingleton instance = new EagerSingleton();
	
	// has to be private
	private EagerSingleton() {}
	
	// publicly accessible Methode to get the private instance
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	private int counter;
	
	public void add() {
		counter++;
	}
	
	public static void main(String[] args) {
		EagerSingleton.getInstance().add();
		System.out.println(EagerSingleton.getInstance().counter);
	}
	
}
