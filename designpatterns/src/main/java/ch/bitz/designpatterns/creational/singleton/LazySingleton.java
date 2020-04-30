package ch.bitz.designpatterns.creational.singleton;

// Lazy Singletons sind nicht Thread-Sicher
public class LazySingleton {
	// not final, not instantiated, doesn't create instance
	private static LazySingleton instance;
	
	// has to be private
	private LazySingleton() {}
	
	// publicly accessible Methode to get the private instance
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	private int counter;
	
	public int getCounter() {
		return counter;
	}
	
	public void add() {
		counter++;
	}
	
	public static void main(String[] args) {
		LazySingleton.getInstance().add();
		System.out.println(LazySingleton.getInstance().getCounter());
	}
	
}
